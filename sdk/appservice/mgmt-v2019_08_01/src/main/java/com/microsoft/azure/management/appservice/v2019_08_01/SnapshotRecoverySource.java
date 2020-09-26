/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the web app that snapshot contents will be retrieved from.
 */
public class SnapshotRecoverySource {
    /**
     * Geographical location of the source web app, e.g. SouthEastAsia,
     * SouthCentralUS.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * ARM resource ID of the source app.
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}
     * for production slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName}
     * for other slots.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get geographical location of the source web app, e.g. SouthEastAsia, SouthCentralUS.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set geographical location of the source web app, e.g. SouthEastAsia, SouthCentralUS.
     *
     * @param location the location value to set
     * @return the SnapshotRecoverySource object itself.
     */
    public SnapshotRecoverySource withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get aRM resource ID of the source app.
     /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production slots and
     /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName} for other slots.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set aRM resource ID of the source app.
     /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production slots and
     /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName} for other slots.
     *
     * @param id the id value to set
     * @return the SnapshotRecoverySource object itself.
     */
    public SnapshotRecoverySource withId(String id) {
        this.id = id;
        return this;
    }

}
