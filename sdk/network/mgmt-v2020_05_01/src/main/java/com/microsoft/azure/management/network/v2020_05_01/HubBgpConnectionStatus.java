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
 * Defines values for HubBgpConnectionStatus.
 */
public final class HubBgpConnectionStatus extends ExpandableStringEnum<HubBgpConnectionStatus> {
    /** Static value Unknown for HubBgpConnectionStatus. */
    public static final HubBgpConnectionStatus UNKNOWN = fromString("Unknown");

    /** Static value Connecting for HubBgpConnectionStatus. */
    public static final HubBgpConnectionStatus CONNECTING = fromString("Connecting");

    /** Static value Connected for HubBgpConnectionStatus. */
    public static final HubBgpConnectionStatus CONNECTED = fromString("Connected");

    /** Static value NotConnected for HubBgpConnectionStatus. */
    public static final HubBgpConnectionStatus NOT_CONNECTED = fromString("NotConnected");

    /**
     * Creates or finds a HubBgpConnectionStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding HubBgpConnectionStatus
     */
    @JsonCreator
    public static HubBgpConnectionStatus fromString(String name) {
        return fromString(name, HubBgpConnectionStatus.class);
    }

    /**
     * @return known HubBgpConnectionStatus values
     */
    public static Collection<HubBgpConnectionStatus> values() {
        return values(HubBgpConnectionStatus.class);
    }
}
