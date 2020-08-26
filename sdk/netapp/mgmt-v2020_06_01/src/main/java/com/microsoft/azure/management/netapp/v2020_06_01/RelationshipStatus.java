/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RelationshipStatus.
 */
public final class RelationshipStatus extends ExpandableStringEnum<RelationshipStatus> {
    /** Static value Idle for RelationshipStatus. */
    public static final RelationshipStatus IDLE = fromString("Idle");

    /** Static value Transferring for RelationshipStatus. */
    public static final RelationshipStatus TRANSFERRING = fromString("Transferring");

    /**
     * Creates or finds a RelationshipStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding RelationshipStatus
     */
    @JsonCreator
    public static RelationshipStatus fromString(String name) {
        return fromString(name, RelationshipStatus.class);
    }

    /**
     * @return known RelationshipStatus values
     */
    public static Collection<RelationshipStatus> values() {
        return values(RelationshipStatus.class);
    }
}
