/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ProbeProtocol.
 */
public enum ProbeProtocol {
    /** Enum value NotSet. */
    NOT_SET("NotSet"),

    /** Enum value Http. */
    HTTP("Http"),

    /** Enum value Https. */
    HTTPS("Https");

    /** The actual serialized value for a ProbeProtocol instance. */
    private String value;

    ProbeProtocol(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ProbeProtocol instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ProbeProtocol object, or null if unable to parse.
     */
    @JsonCreator
    public static ProbeProtocol fromString(String value) {
        ProbeProtocol[] items = ProbeProtocol.values();
        for (ProbeProtocol item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
