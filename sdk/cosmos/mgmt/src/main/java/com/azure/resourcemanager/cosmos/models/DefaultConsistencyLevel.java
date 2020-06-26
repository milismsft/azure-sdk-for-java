// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for DefaultConsistencyLevel. */
public enum DefaultConsistencyLevel {
    /** Enum value Eventual. */
    EVENTUAL("Eventual"),

    /** Enum value Session. */
    SESSION("Session"),

    /** Enum value BoundedStaleness. */
    BOUNDED_STALENESS("BoundedStaleness"),

    /** Enum value Strong. */
    STRONG("Strong"),

    /** Enum value ConsistentPrefix. */
    CONSISTENT_PREFIX("ConsistentPrefix");

    /** The actual serialized value for a DefaultConsistencyLevel instance. */
    private final String value;

    DefaultConsistencyLevel(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DefaultConsistencyLevel instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DefaultConsistencyLevel object, or null if unable to parse.
     */
    @JsonCreator
    public static DefaultConsistencyLevel fromString(String value) {
        DefaultConsistencyLevel[] items = DefaultConsistencyLevel.values();
        for (DefaultConsistencyLevel item : items) {
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
