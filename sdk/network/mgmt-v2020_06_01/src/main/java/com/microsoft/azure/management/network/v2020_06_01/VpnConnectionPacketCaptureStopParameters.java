/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Vpn Connection packet capture parameters supplied to stop packet capture on
 * gateway connection.
 */
public class VpnConnectionPacketCaptureStopParameters {
    /**
     * SAS url for packet capture on vpn connection.
     */
    @JsonProperty(value = "sasUrl")
    private String sasUrl;

    /**
     * List of site link connection names.
     */
    @JsonProperty(value = "linkConnectionNames")
    private List<String> linkConnectionNames;

    /**
     * Get sAS url for packet capture on vpn connection.
     *
     * @return the sasUrl value
     */
    public String sasUrl() {
        return this.sasUrl;
    }

    /**
     * Set sAS url for packet capture on vpn connection.
     *
     * @param sasUrl the sasUrl value to set
     * @return the VpnConnectionPacketCaptureStopParameters object itself.
     */
    public VpnConnectionPacketCaptureStopParameters withSasUrl(String sasUrl) {
        this.sasUrl = sasUrl;
        return this;
    }

    /**
     * Get list of site link connection names.
     *
     * @return the linkConnectionNames value
     */
    public List<String> linkConnectionNames() {
        return this.linkConnectionNames;
    }

    /**
     * Set list of site link connection names.
     *
     * @param linkConnectionNames the linkConnectionNames value to set
     * @return the VpnConnectionPacketCaptureStopParameters object itself.
     */
    public VpnConnectionPacketCaptureStopParameters withLinkConnectionNames(List<String> linkConnectionNames) {
        this.linkConnectionNames = linkConnectionNames;
        return this;
    }

}
