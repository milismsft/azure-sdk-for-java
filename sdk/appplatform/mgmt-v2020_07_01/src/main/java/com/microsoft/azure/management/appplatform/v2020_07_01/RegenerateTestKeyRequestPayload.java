/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Regenerate test key request payload.
 */
public class RegenerateTestKeyRequestPayload {
    /**
     * Type of the test key. Possible values include: 'Primary', 'Secondary'.
     */
    @JsonProperty(value = "keyType", required = true)
    private TestKeyType keyType;

    /**
     * Get type of the test key. Possible values include: 'Primary', 'Secondary'.
     *
     * @return the keyType value
     */
    public TestKeyType keyType() {
        return this.keyType;
    }

    /**
     * Set type of the test key. Possible values include: 'Primary', 'Secondary'.
     *
     * @param keyType the keyType value to set
     * @return the RegenerateTestKeyRequestPayload object itself.
     */
    public RegenerateTestKeyRequestPayload withKeyType(TestKeyType keyType) {
        this.keyType = keyType;
        return this;
    }

}
