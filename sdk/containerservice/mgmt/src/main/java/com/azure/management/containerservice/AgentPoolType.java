// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AgentPoolType. */
public final class AgentPoolType extends ExpandableStringEnum<AgentPoolType> {
    /** Static value VirtualMachineScaleSets for AgentPoolType. */
    public static final AgentPoolType VIRTUAL_MACHINE_SCALE_SETS = fromString("VirtualMachineScaleSets");

    /** Static value AvailabilitySet for AgentPoolType. */
    public static final AgentPoolType AVAILABILITY_SET = fromString("AvailabilitySet");

    /**
     * Creates or finds a AgentPoolType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AgentPoolType.
     */
    @JsonCreator
    public static AgentPoolType fromString(String name) {
        return fromString(name, AgentPoolType.class);
    }

    /** @return known AgentPoolType values. */
    public static Collection<AgentPoolType> values() {
        return values(AgentPoolType.class);
    }
}
