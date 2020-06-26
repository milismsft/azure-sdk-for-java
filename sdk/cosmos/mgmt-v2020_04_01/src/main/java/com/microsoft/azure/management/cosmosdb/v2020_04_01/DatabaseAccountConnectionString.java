/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Connection string for the Cosmos DB account.
 */
public class DatabaseAccountConnectionString {
    /**
     * Value of the connection string.
     */
    @JsonProperty(value = "connectionString", access = JsonProperty.Access.WRITE_ONLY)
    private String connectionString;

    /**
     * Description of the connection string.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get value of the connection string.
     *
     * @return the connectionString value
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Get description of the connection string.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

}
