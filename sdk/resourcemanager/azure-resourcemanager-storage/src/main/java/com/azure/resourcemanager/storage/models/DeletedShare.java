// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The deleted share to be restored. */
@Fluent
public final class DeletedShare {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeletedShare.class);

    /*
     * Required. Identify the name of the deleted share that will be restored.
     */
    @JsonProperty(value = "deletedShareName", required = true)
    private String deletedShareName;

    /*
     * Required. Identify the version of the deleted share that will be
     * restored.
     */
    @JsonProperty(value = "deletedShareVersion", required = true)
    private String deletedShareVersion;

    /**
     * Get the deletedShareName property: Required. Identify the name of the deleted share that will be restored.
     *
     * @return the deletedShareName value.
     */
    public String deletedShareName() {
        return this.deletedShareName;
    }

    /**
     * Set the deletedShareName property: Required. Identify the name of the deleted share that will be restored.
     *
     * @param deletedShareName the deletedShareName value to set.
     * @return the DeletedShare object itself.
     */
    public DeletedShare withDeletedShareName(String deletedShareName) {
        this.deletedShareName = deletedShareName;
        return this;
    }

    /**
     * Get the deletedShareVersion property: Required. Identify the version of the deleted share that will be restored.
     *
     * @return the deletedShareVersion value.
     */
    public String deletedShareVersion() {
        return this.deletedShareVersion;
    }

    /**
     * Set the deletedShareVersion property: Required. Identify the version of the deleted share that will be restored.
     *
     * @param deletedShareVersion the deletedShareVersion value to set.
     * @return the DeletedShare object itself.
     */
    public DeletedShare withDeletedShareVersion(String deletedShareVersion) {
        this.deletedShareVersion = deletedShareVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deletedShareName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property deletedShareName in model DeletedShare"));
        }
        if (deletedShareVersion() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property deletedShareVersion in model DeletedShare"));
        }
    }
}
