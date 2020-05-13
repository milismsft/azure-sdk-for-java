/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for CreateOrUpdate operation.
 */
public class AuthorizationServerCreateOrUpdateHeaders {
    /**
     * Current entity state version. Should be treated as opaque and used to
     * make conditional HTTP requests.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * Get current entity state version. Should be treated as opaque and used to make conditional HTTP requests.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set current entity state version. Should be treated as opaque and used to make conditional HTTP requests.
     *
     * @param eTag the eTag value to set
     * @return the AuthorizationServerCreateOrUpdateHeaders object itself.
     */
    public AuthorizationServerCreateOrUpdateHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
