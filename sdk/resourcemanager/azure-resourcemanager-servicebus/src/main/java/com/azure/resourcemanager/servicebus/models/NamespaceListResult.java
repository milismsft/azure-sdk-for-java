// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.fluent.models.NamespaceResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of the List Namespace operation. */
@Fluent
public final class NamespaceListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NamespaceListResult.class);

    /*
     * Result of the List Namespace operation.
     */
    @JsonProperty(value = "value")
    private List<NamespaceResourceInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete
     * list of Namespaces.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Result of the List Namespace operation.
     *
     * @return the value value.
     */
    public List<NamespaceResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List Namespace operation.
     *
     * @param value the value value to set.
     * @return the NamespaceListResult object itself.
     */
    public NamespaceListResult withValue(List<NamespaceResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * Namespaces.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * Namespaces.
     *
     * @param nextLink the nextLink value to set.
     * @return the NamespaceListResult object itself.
     */
    public NamespaceListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
