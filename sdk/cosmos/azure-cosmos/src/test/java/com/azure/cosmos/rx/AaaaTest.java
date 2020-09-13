package com.azure.cosmos.rx;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.CosmosAsyncDatabase;
import com.azure.cosmos.CosmosAsyncScripts;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.DirectConnectionConfig;
import com.azure.cosmos.implementation.apachecommons.lang.StringUtils;
import com.azure.cosmos.implementation.guava25.base.Strings;
import com.azure.cosmos.models.CosmosStoredProcedureProperties;
import com.azure.cosmos.models.CosmosStoredProcedureRequestOptions;
import com.azure.cosmos.models.CosmosStoredProcedureResponse;
import com.azure.cosmos.models.PartitionKey;
import com.azure.cosmos.models.ThroughputProperties;
import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.ScheduledReporter;
import org.reactivestreams.Subscriber;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AaaaTest {
    static final String DATABASE_NAME = "test_database";
    static final String CONTAINER_NAME = "test_container";
    static final String SPROC_ID1 = "test-sproc-id";
    static final String SPROC_ID2 = "store-proc-2";
    static final String SPROC_ID3 = "store-proc-3";
    static final String SPROC_ID4 = "store-proc-4";
    private static final Properties properties = System.getProperties();
    public final static String MASTER_KEY =
        properties.getProperty("ACCOUNT_KEY",
            StringUtils.defaultString(Strings.emptyToNull(
                System.getenv().get("ACCOUNT_KEY")),
                ""));
    public final static String HOST =
        properties.getProperty("ACCOUNT_HOST",
            StringUtils.defaultString(Strings.emptyToNull(
                System.getenv().get("ACCOUNT_HOST")),
                ""));
    CosmosAsyncClient client1;
    CosmosAsyncClient client2;
    CosmosAsyncClient client3;
    CosmosAsyncClient client4;
    CosmosAsyncContainer asyncContainer1;
    CosmosAsyncContainer asyncContainer2;
    CosmosAsyncContainer asyncContainer3;
    CosmosAsyncContainer asyncContainer4;

    ScheduledReporter reporter;
    private Meter successMeter;
    private Meter failureMeter;
    private Meter operationsMeter;
    private Meter launchedMeter;

    private static final int REPORT_SECS = 20;

    public static void main(String[] args) {
        long millis = 10 * 60 * 1000; //min * s *  ms

        AaaaTest m = new AaaaTest();
        int numOps = 5000;
        if (args.length < 0) {
            System.out.println(" Specify number of operations");
//            return;
        } else if (args.length >= 1) {
            numOps = Integer.parseInt(args[0]);
        }
        m.runTest(numOps);

//        try {
//            System.out.println("sleeping");
//            waitUntilSpecifiedTime(millis);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("Started");
    }

    private static void waitUntilSpecifiedTime(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    void finish() {
        client1.close();
    }

    private void runTest(int numOps) {
        /**
         * Creates a client
         * Creates a db and container
         * creates four stored procedures
         * Runs stored procedures for specified number of times
         */
        System.out.println("Initializing client");
        initializeClient();
        System.out.println("Initializing metrics");
        initMetrics();

        System.out.println("Running test: Metrics will be printed periodically every " + REPORT_SECS + " seconds");
        for (int i = 0; i < numOps; i++) {
            launchedMeter.mark(4);
            execStoredProcedure(asyncContainer1, SPROC_ID1);
            execStoredProcedure(asyncContainer1, SPROC_ID2);
            execStoredProcedure(asyncContainer1, SPROC_ID3);
            execStoredProcedure(asyncContainer1, SPROC_ID4);

            if (i % 1000 == 0) {
                try {
                    Thread.sleep(5000);
                } catch (Exception ex) {}
            }
        }

    }

    private void trySetupData(CosmosAsyncClient client) {
        client.createDatabaseIfNotExists(DATABASE_NAME)
            .flatMap(cosmosDatabaseResponse -> {
                CosmosAsyncDatabase database = client.getDatabase(cosmosDatabaseResponse
                    .getProperties()
                    .getId());
                ThroughputProperties throughputProperties = ThroughputProperties
                    .createManualThroughput(10000);
                return database.createContainerIfNotExists(CONTAINER_NAME,
                    "/mypk", throughputProperties);
            }).block();
        asyncContainer1 = client1.getDatabase(DATABASE_NAME).getContainer(CONTAINER_NAME);
        createStoredProcedure(asyncContainer1);
    }

    private void initMetrics() {

        MetricRegistry metricsRegistry = new MetricRegistry();
        successMeter = metricsRegistry.meter("success-meter");
        failureMeter = metricsRegistry.meter("failure-meter");
        operationsMeter = metricsRegistry.meter("completed-meter");
        launchedMeter = metricsRegistry.meter("launched-meter");

        reporter = ConsoleReporter.forRegistry(metricsRegistry)
            .convertDurationsTo(TimeUnit.MILLISECONDS)
            .convertRatesTo(TimeUnit.SECONDS)
            .build();
        reporter.start(REPORT_SECS, TimeUnit.SECONDS);

    }

    private void initializeClient() {
        DirectConnectionConfig directConnectionConfig = new DirectConnectionConfig().setMaxConnectionsPerEndpoint(1);
        client1 = new CosmosClientBuilder()
            .endpoint(HOST)
            .key(MASTER_KEY)
            .directMode(directConnectionConfig)
            .consistencyLevel(ConsistencyLevel.EVENTUAL)
            .buildAsyncClient();
//        client2 = new CosmosClientBuilder()
//                          .endpoint(END_POINT).key(MASTER_KEY)
//                          .directMode(directConnectionConfig)
//                          .consistencyLevel(ConsistencyLevel.EVENTUAL)
//                          .buildAsyncClient();
//        client3 = new CosmosClientBuilder()
//                          .endpoint(END_POINT).key(MASTER_KEY)
//                          .directMode(directConnectionConfig)
//                          .consistencyLevel(ConsistencyLevel.EVENTUAL)
//                          .buildAsyncClient();
//        client4 = new CosmosClientBuilder()
//                          .endpoint(END_POINT).key(MASTER_KEY)
//                          .directMode(directConnectionConfig)
//                          .consistencyLevel(ConsistencyLevel.EVENTUAL)
//                          .buildAsyncClient();
        System.out.println("Trying to setup data");
        trySetupData(client1);
//        asyncContainer2 = client1.getDatabase(DATABASE_NAME).getContainer(CONTAINER_NAME);
//        asyncContainer3 = client1.getDatabase(DATABASE_NAME).getContainer(CONTAINER_NAME);
//        asyncContainer4 = client1.getDatabase(DATABASE_NAME).getContainer(CONTAINER_NAME);

    }

    private void execStoredProcedure(CosmosAsyncContainer container, String sprocId) {
        Subscriber<CosmosStoredProcedureResponse> responseSubscriber =
            new BaseSubscriber<CosmosStoredProcedureResponse>() {
                @Override
                protected void hookOnNext(CosmosStoredProcedureResponse cosmosStoredProcedureResponse) {
                    successMeter.mark();
                }

                @Override
                protected void hookOnError(Throwable throwable) {
                    failureMeter.mark();
                }

                @Override
                protected void hookOnComplete() {
                    operationsMeter.mark();
                }
            };
        Mono<CosmosStoredProcedureResponse> execute = container.getScripts().getStoredProcedure(sprocId)
            .execute(new ArrayList<Object>(),
                new CosmosStoredProcedureRequestOptions()
                    .setPartitionKey(new PartitionKey(("US"
                    ))));
        execute.subscribe(responseSubscriber);

    }

    private void createStoredProcedure(CosmosAsyncContainer container) {
        CosmosAsyncScripts asyncScripts = container.getScripts();

        try {
            asyncScripts.createStoredProcedure(getStoredProcDef(SPROC_ID1)).block();
            asyncScripts.createStoredProcedure(getStoredProcDef(SPROC_ID2)).block();
            asyncScripts.createStoredProcedure(getStoredProcDef(SPROC_ID3)).block();
            asyncScripts.createStoredProcedure(getStoredProcDef(SPROC_ID4)).block();
        } catch (Exception e) {
            System.out.println("e = " + e);
        }

    }

    CosmosStoredProcedureProperties getStoredProcDef(String id) {
        return new CosmosStoredProcedureProperties(
            id,
            "function() {var context = getContext();  \n" +
                "        var response = context.getResponse();  \n" +
                "  \n" +
                "        response.setBody(\"Hello, World\"); }"
        );
    }
}
