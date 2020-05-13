// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.cosmosdb.ARMProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NotebookWorkspace model. */
@JsonFlatten
@Immutable
public class NotebookWorkspaceInner extends ARMProxyResource {
    /*
     * Specifies the endpoint of Notebook server.
     */
    @JsonProperty(value = "properties.notebookServerEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String notebookServerEndpoint;

    /*
     * Status of the notebook workspace. Possible values are: Creating, Online,
     * Deleting, Failed, Updating.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Get the notebookServerEndpoint property: Specifies the endpoint of Notebook server.
     *
     * @return the notebookServerEndpoint value.
     */
    public String notebookServerEndpoint() {
        return this.notebookServerEndpoint;
    }

    /**
     * Get the status property: Status of the notebook workspace. Possible values are: Creating, Online, Deleting,
     * Failed, Updating.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }
}
