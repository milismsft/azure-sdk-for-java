// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TroubleshootingParameters model. */
@JsonFlatten
@Fluent
public class TroubleshootingParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TroubleshootingParameters.class);

    /*
     * The target resource to troubleshoot.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /*
     * The ID for the storage account to save the troubleshoot result.
     */
    @JsonProperty(value = "properties.storageId", required = true)
    private String storageId;

    /*
     * The path to the blob to save the troubleshoot result in.
     */
    @JsonProperty(value = "properties.storagePath", required = true)
    private String storagePath;

    /**
     * Get the targetResourceId property: The target resource to troubleshoot.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The target resource to troubleshoot.
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the TroubleshootingParameters object itself.
     */
    public TroubleshootingParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the storageId property: The ID for the storage account to save the troubleshoot result.
     *
     * @return the storageId value.
     */
    public String storageId() {
        return this.storageId;
    }

    /**
     * Set the storageId property: The ID for the storage account to save the troubleshoot result.
     *
     * @param storageId the storageId value to set.
     * @return the TroubleshootingParameters object itself.
     */
    public TroubleshootingParameters withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * Get the storagePath property: The path to the blob to save the troubleshoot result in.
     *
     * @return the storagePath value.
     */
    public String storagePath() {
        return this.storagePath;
    }

    /**
     * Set the storagePath property: The path to the blob to save the troubleshoot result in.
     *
     * @param storagePath the storagePath value to set.
     * @return the TroubleshootingParameters object itself.
     */
    public TroubleshootingParameters withStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetResourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetResourceId in model TroubleshootingParameters"));
        }
        if (storageId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageId in model TroubleshootingParameters"));
        }
        if (storagePath() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storagePath in model TroubleshootingParameters"));
        }
    }
}
