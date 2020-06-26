// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DdosSettingsProtectionCoverage. */
public final class DdosSettingsProtectionCoverage extends ExpandableStringEnum<DdosSettingsProtectionCoverage> {
    /** Static value Basic for DdosSettingsProtectionCoverage. */
    public static final DdosSettingsProtectionCoverage BASIC = fromString("Basic");

    /** Static value Standard for DdosSettingsProtectionCoverage. */
    public static final DdosSettingsProtectionCoverage STANDARD = fromString("Standard");

    /**
     * Creates or finds a DdosSettingsProtectionCoverage from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DdosSettingsProtectionCoverage.
     */
    @JsonCreator
    public static DdosSettingsProtectionCoverage fromString(String name) {
        return fromString(name, DdosSettingsProtectionCoverage.class);
    }

    /** @return known DdosSettingsProtectionCoverage values. */
    public static Collection<DdosSettingsProtectionCoverage> values() {
        return values(DdosSettingsProtectionCoverage.class);
    }
}
