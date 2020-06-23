// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VirtualHubRouteTable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualHub model. */
@JsonFlatten
@Fluent
public class VirtualHubInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualHubInner.class);

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The VirtualWAN to which the VirtualHub belongs.
     */
    @JsonProperty(value = "properties.virtualWan")
    private SubResource virtualWan;

    /*
     * The VpnGateway associated with this VirtualHub.
     */
    @JsonProperty(value = "properties.vpnGateway")
    private SubResource vpnGateway;

    /*
     * The P2SVpnGateway associated with this VirtualHub.
     */
    @JsonProperty(value = "properties.p2SVpnGateway")
    private SubResource p2SVpnGateway;

    /*
     * The expressRouteGateway associated with this VirtualHub.
     */
    @JsonProperty(value = "properties.expressRouteGateway")
    private SubResource expressRouteGateway;

    /*
     * List of all vnet connections with this VirtualHub.
     */
    @JsonProperty(value = "properties.virtualNetworkConnections")
    private List<HubVirtualNetworkConnectionInner> virtualNetworkConnections;

    /*
     * Address-prefix for this VirtualHub.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /*
     * The routeTable associated with this virtual hub.
     */
    @JsonProperty(value = "properties.routeTable")
    private VirtualHubRouteTable routeTable;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the virtualWan property: The VirtualWAN to which the VirtualHub belongs.
     *
     * @return the virtualWan value.
     */
    public SubResource virtualWan() {
        return this.virtualWan;
    }

    /**
     * Set the virtualWan property: The VirtualWAN to which the VirtualHub belongs.
     *
     * @param virtualWan the virtualWan value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVirtualWan(SubResource virtualWan) {
        this.virtualWan = virtualWan;
        return this;
    }

    /**
     * Get the vpnGateway property: The VpnGateway associated with this VirtualHub.
     *
     * @return the vpnGateway value.
     */
    public SubResource vpnGateway() {
        return this.vpnGateway;
    }

    /**
     * Set the vpnGateway property: The VpnGateway associated with this VirtualHub.
     *
     * @param vpnGateway the vpnGateway value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVpnGateway(SubResource vpnGateway) {
        this.vpnGateway = vpnGateway;
        return this;
    }

    /**
     * Get the p2SVpnGateway property: The P2SVpnGateway associated with this VirtualHub.
     *
     * @return the p2SVpnGateway value.
     */
    public SubResource p2SVpnGateway() {
        return this.p2SVpnGateway;
    }

    /**
     * Set the p2SVpnGateway property: The P2SVpnGateway associated with this VirtualHub.
     *
     * @param p2SVpnGateway the p2SVpnGateway value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withP2SVpnGateway(SubResource p2SVpnGateway) {
        this.p2SVpnGateway = p2SVpnGateway;
        return this;
    }

    /**
     * Get the expressRouteGateway property: The expressRouteGateway associated with this VirtualHub.
     *
     * @return the expressRouteGateway value.
     */
    public SubResource expressRouteGateway() {
        return this.expressRouteGateway;
    }

    /**
     * Set the expressRouteGateway property: The expressRouteGateway associated with this VirtualHub.
     *
     * @param expressRouteGateway the expressRouteGateway value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withExpressRouteGateway(SubResource expressRouteGateway) {
        this.expressRouteGateway = expressRouteGateway;
        return this;
    }

    /**
     * Get the virtualNetworkConnections property: List of all vnet connections with this VirtualHub.
     *
     * @return the virtualNetworkConnections value.
     */
    public List<HubVirtualNetworkConnectionInner> virtualNetworkConnections() {
        return this.virtualNetworkConnections;
    }

    /**
     * Set the virtualNetworkConnections property: List of all vnet connections with this VirtualHub.
     *
     * @param virtualNetworkConnections the virtualNetworkConnections value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVirtualNetworkConnections(
        List<HubVirtualNetworkConnectionInner> virtualNetworkConnections) {
        this.virtualNetworkConnections = virtualNetworkConnections;
        return this;
    }

    /**
     * Get the addressPrefix property: Address-prefix for this VirtualHub.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: Address-prefix for this VirtualHub.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the routeTable property: The routeTable associated with this virtual hub.
     *
     * @return the routeTable value.
     */
    public VirtualHubRouteTable routeTable() {
        return this.routeTable;
    }

    /**
     * Set the routeTable property: The routeTable associated with this virtual hub.
     *
     * @param routeTable the routeTable value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withRouteTable(VirtualHubRouteTable routeTable) {
        this.routeTable = routeTable;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualNetworkConnections() != null) {
            virtualNetworkConnections().forEach(e -> e.validate());
        }
        if (routeTable() != null) {
            routeTable().validate();
        }
    }
}
