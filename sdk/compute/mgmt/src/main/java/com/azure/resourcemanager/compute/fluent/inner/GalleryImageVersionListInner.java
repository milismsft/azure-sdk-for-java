// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The GalleryImageVersionList model. */
@Fluent
public final class GalleryImageVersionListInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryImageVersionListInner.class);

    /*
     * A list of gallery Image Versions.
     */
    @JsonProperty(value = "value", required = true)
    private List<GalleryImageVersionInner> value;

    /*
     * The uri to fetch the next page of gallery Image Versions. Call
     * ListNext() with this to fetch the next page of gallery Image Versions.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of gallery Image Versions.
     *
     * @return the value value.
     */
    public List<GalleryImageVersionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of gallery Image Versions.
     *
     * @param value the value value to set.
     * @return the GalleryImageVersionListInner object itself.
     */
    public GalleryImageVersionListInner withValue(List<GalleryImageVersionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of gallery Image Versions. Call ListNext() with this to
     * fetch the next page of gallery Image Versions.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of gallery Image Versions. Call ListNext() with this to
     * fetch the next page of gallery Image Versions.
     *
     * @param nextLink the nextLink value to set.
     * @return the GalleryImageVersionListInner object itself.
     */
    public GalleryImageVersionListInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model GalleryImageVersionListInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
