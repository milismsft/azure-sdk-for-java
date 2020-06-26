/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ExpressRoutePortsEncapsulation.
 */
public final class ExpressRoutePortsEncapsulation extends ExpandableStringEnum<ExpressRoutePortsEncapsulation> {
    /** Static value Dot1Q for ExpressRoutePortsEncapsulation. */
    public static final ExpressRoutePortsEncapsulation DOT1Q = fromString("Dot1Q");

    /** Static value QinQ for ExpressRoutePortsEncapsulation. */
    public static final ExpressRoutePortsEncapsulation QINQ = fromString("QinQ");

    /**
     * Creates or finds a ExpressRoutePortsEncapsulation from its string representation.
     * @param name a name to look for
     * @return the corresponding ExpressRoutePortsEncapsulation
     */
    @JsonCreator
    public static ExpressRoutePortsEncapsulation fromString(String name) {
        return fromString(name, ExpressRoutePortsEncapsulation.class);
    }

    /**
     * @return known ExpressRoutePortsEncapsulation values
     */
    public static Collection<ExpressRoutePortsEncapsulation> values() {
        return values(ExpressRoutePortsEncapsulation.class);
    }
}
