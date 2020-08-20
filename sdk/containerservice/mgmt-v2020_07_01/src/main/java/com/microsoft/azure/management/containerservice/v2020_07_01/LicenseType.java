/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LicenseType.
 */
public final class LicenseType extends ExpandableStringEnum<LicenseType> {
    /** Static value None for LicenseType. */
    public static final LicenseType NONE = fromString("None");

    /** Static value Windows_Server for LicenseType. */
    public static final LicenseType WINDOWS_SERVER = fromString("Windows_Server");

    /**
     * Creates or finds a LicenseType from its string representation.
     * @param name a name to look for
     * @return the corresponding LicenseType
     */
    @JsonCreator
    public static LicenseType fromString(String name) {
        return fromString(name, LicenseType.class);
    }

    /**
     * @return known LicenseType values
     */
    public static Collection<LicenseType> values() {
        return values(LicenseType.class);
    }
}
