package com.azure.cosmos.rx;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.CosmosAsyncDatabase;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.CosmosException;
import com.azure.cosmos.DirectConnectionConfig;
import com.azure.cosmos.implementation.Integers;
import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.implementation.apachecommons.lang.StringUtils;
import com.azure.cosmos.implementation.guava25.base.Strings;
import com.azure.cosmos.models.PartitionKey;
import com.azure.cosmos.models.ThroughputProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Properties;
import java.util.Random;

public class AaaaTest {
    private static final ObjectMapper OBJECT_MAPPER = Utils.getSimpleObjectMapper();
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
    static final String DATABASE_NAME = "test_database";
    static final String CONTAINER_NAME = "test_container";
    static final int NUM_ITEMS = 10000;
    static final Random randomGenerator = new Random();

    static CosmosAsyncClient client;

    public static void main(String[] args) {
        System.out.println("Started");

        try {
            DirectConnectionConfig directConnectionConfig = new DirectConnectionConfig().setMaxConnectionsPerEndpoint(1);
            client = new CosmosClientBuilder()
                .endpoint(HOST)
                .key(MASTER_KEY)
                .directMode(directConnectionConfig)
                .consistencyLevel(ConsistencyLevel.EVENTUAL)
                .buildAsyncClient();

            client.createDatabaseIfNotExists(DATABASE_NAME)
                .flatMap(cosmosDatabaseResponse -> {
                    CosmosAsyncDatabase database = client.getDatabase(cosmosDatabaseResponse
                        .getProperties()
                        .getId());
                    ThroughputProperties throughputProperties = ThroughputProperties
                        .createManualThroughput(14000);
                    return database.createContainerIfNotExists(CONTAINER_NAME,
                        "/id", throughputProperties);
                }).block();
            CosmosAsyncContainer asyncContainer = client.getDatabase(DATABASE_NAME).getContainer(CONTAINER_NAME);

            addItems(asyncContainer);

//            for (int i = 0; i < 100; i++) {
//                MyItem item = readRandomItem(asyncContainer);
//                try {
//                    System.out.println("Found MyItem: " + OBJECT_MAPPER.writeValueAsString(item));
//                } catch (Exception ex) {
//                }
//            }

        } finally {
            if (client != null) {
                client.close();
            }
        }

    }

    static MyItem readRandomItem(CosmosAsyncContainer asyncContainer) {
        int itemId = randomGenerator.nextInt(NUM_ITEMS);
        String id = Integer.toString(itemId);

        return readItem(asyncContainer, id);
    }

    static void addItems(CosmosAsyncContainer asyncContainer) {

        for (int i = 0; i <= NUM_ITEMS; i++) {
            String id = Integer.toString(i);
            MyItem item = null;
//            item = readItem(asyncContainer, id);

            if (item == null) {
                item = new MyItem();
                item.id = id;
                asyncContainer.createItem(item).block();
            }
        }
    }

    static MyItem readItem(CosmosAsyncContainer asyncContainer, String id) {
        PartitionKey pKey = new PartitionKey(id);
        MyItem item = null;
        try {
            item = asyncContainer.readItem(id, pKey, MyItem.class).block().getItem();
        } catch (CosmosException ex) {
            if (ex.getStatusCode() == 404) {
                item = null;
            }
        }

        return item;
    }

    static class MyItem {
        public String id;
    }
}
