// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RegionCategory. */
public final class RegionCategory extends ExpandableStringEnum<RegionCategory> {
    /** Static value Recommended for RegionCategory. */
    public static final RegionCategory RECOMMENDED = fromString("Recommended");

    /** Static value Other for RegionCategory. */
    public static final RegionCategory OTHER = fromString("Other");

    /**
     * Creates or finds a RegionCategory from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RegionCategory.
     */
    @JsonCreator
    public static RegionCategory fromString(String name) {
        return fromString(name, RegionCategory.class);
    }

    /** @return known RegionCategory values. */
    public static Collection<RegionCategory> values() {
        return values(RegionCategory.class);
    }
}
