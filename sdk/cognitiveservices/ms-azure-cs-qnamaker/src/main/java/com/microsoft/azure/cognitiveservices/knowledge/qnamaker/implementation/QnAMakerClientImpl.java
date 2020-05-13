/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.Alterations;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.EndpointKeys;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.EndpointSettings;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.Knowledgebases;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.Operations;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.QnAMakerClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the QnAMakerClientImpl class.
 */
public class QnAMakerClientImpl extends AzureServiceClient implements QnAMakerClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus.api.cognitive.microsoft.com). */
    private String endpoint;

    /**
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus.api.cognitive.microsoft.com).
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Sets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus.api.cognitive.microsoft.com).
     *
     * @param endpoint the endpoint value.
     * @return the service client itself
     */
    public QnAMakerClientImpl withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public QnAMakerClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public QnAMakerClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public QnAMakerClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The EndpointSettings object to access its operations.
     */
    private EndpointSettings endpointSettings;

    /**
     * Gets the EndpointSettings object to access its operations.
     * @return the EndpointSettings object.
     */
    public EndpointSettings endpointSettings() {
        return this.endpointSettings;
    }

    /**
     * The EndpointKeys object to access its operations.
     */
    private EndpointKeys endpointKeys;

    /**
     * Gets the EndpointKeys object to access its operations.
     * @return the EndpointKeys object.
     */
    public EndpointKeys endpointKeys() {
        return this.endpointKeys;
    }

    /**
     * The Alterations object to access its operations.
     */
    private Alterations alterations;

    /**
     * Gets the Alterations object to access its operations.
     * @return the Alterations object.
     */
    public Alterations alterations() {
        return this.alterations;
    }

    /**
     * The Knowledgebases object to access its operations.
     */
    private Knowledgebases knowledgebases;

    /**
     * Gets the Knowledgebases object to access its operations.
     * @return the Knowledgebases object.
     */
    public Knowledgebases knowledgebases() {
        return this.knowledgebases;
    }

    /**
     * The Operations object to access its operations.
     */
    private Operations operations;

    /**
     * Gets the Operations object to access its operations.
     * @return the Operations object.
     */
    public Operations operations() {
        return this.operations;
    }

    /**
     * Initializes an instance of QnAMakerClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public QnAMakerClientImpl(ServiceClientCredentials credentials) {
        this("https://{Endpoint}/qnamaker/v4.0", credentials);
    }

    /**
     * Initializes an instance of QnAMakerClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public QnAMakerClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of QnAMakerClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public QnAMakerClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.endpointSettings = new EndpointSettingsImpl(restClient().retrofit(), this);
        this.endpointKeys = new EndpointKeysImpl(restClient().retrofit(), this);
        this.alterations = new AlterationsImpl(restClient().retrofit(), this);
        this.knowledgebases = new KnowledgebasesImpl(restClient().retrofit(), this);
        this.operations = new OperationsImpl(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "QnAMakerClient", "4.0");
    }
}
