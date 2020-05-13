/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.management.network.v2020_03_01.ExpressRouteCircuitConnection;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_03_01.Ipv6CircuitConnectionConfig;
import com.microsoft.azure.management.network.v2020_03_01.CircuitConnectionStatus;
import com.microsoft.azure.management.network.v2020_03_01.ProvisioningState;

class ExpressRouteCircuitConnectionImpl extends CreatableUpdatableImpl<ExpressRouteCircuitConnection, ExpressRouteCircuitConnectionInner, ExpressRouteCircuitConnectionImpl> implements ExpressRouteCircuitConnection, ExpressRouteCircuitConnection.Definition, ExpressRouteCircuitConnection.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String circuitName;
    private String peeringName;
    private String connectionName;

    ExpressRouteCircuitConnectionImpl(String name, NetworkManager manager) {
        super(name, new ExpressRouteCircuitConnectionInner());
        this.manager = manager;
        // Set resource name
        this.connectionName = name;
        //
    }

    ExpressRouteCircuitConnectionImpl(ExpressRouteCircuitConnectionInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.connectionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.circuitName = IdParsingUtils.getValueFromIdByName(inner.id(), "expressRouteCircuits");
        this.peeringName = IdParsingUtils.getValueFromIdByName(inner.id(), "peerings");
        this.connectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "connections");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ExpressRouteCircuitConnection> createResourceAsync() {
        ExpressRouteCircuitConnectionsInner client = this.manager().inner().expressRouteCircuitConnections();
        return client.createOrUpdateAsync(this.resourceGroupName, this.circuitName, this.peeringName, this.connectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ExpressRouteCircuitConnection> updateResourceAsync() {
        ExpressRouteCircuitConnectionsInner client = this.manager().inner().expressRouteCircuitConnections();
        return client.createOrUpdateAsync(this.resourceGroupName, this.circuitName, this.peeringName, this.connectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ExpressRouteCircuitConnectionInner> getInnerAsync() {
        ExpressRouteCircuitConnectionsInner client = this.manager().inner().expressRouteCircuitConnections();
        return client.getAsync(this.resourceGroupName, this.circuitName, this.peeringName, this.connectionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String addressPrefix() {
        return this.inner().addressPrefix();
    }

    @Override
    public String authorizationKey() {
        return this.inner().authorizationKey();
    }

    @Override
    public CircuitConnectionStatus circuitConnectionStatus() {
        return this.inner().circuitConnectionStatus();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public SubResource expressRouteCircuitPeering() {
        return this.inner().expressRouteCircuitPeering();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig() {
        return this.inner().ipv6CircuitConnectionConfig();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public SubResource peerExpressRouteCircuitPeering() {
        return this.inner().peerExpressRouteCircuitPeering();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ExpressRouteCircuitConnectionImpl withExistingPeering(String resourceGroupName, String circuitName, String peeringName) {
        this.resourceGroupName = resourceGroupName;
        this.circuitName = circuitName;
        this.peeringName = peeringName;
        return this;
    }

    @Override
    public ExpressRouteCircuitConnectionImpl withAddressPrefix(String addressPrefix) {
        this.inner().withAddressPrefix(addressPrefix);
        return this;
    }

    @Override
    public ExpressRouteCircuitConnectionImpl withAuthorizationKey(String authorizationKey) {
        this.inner().withAuthorizationKey(authorizationKey);
        return this;
    }

    @Override
    public ExpressRouteCircuitConnectionImpl withCircuitConnectionStatus(CircuitConnectionStatus circuitConnectionStatus) {
        this.inner().withCircuitConnectionStatus(circuitConnectionStatus);
        return this;
    }

    @Override
    public ExpressRouteCircuitConnectionImpl withExpressRouteCircuitPeering(SubResource expressRouteCircuitPeering) {
        this.inner().withExpressRouteCircuitPeering(expressRouteCircuitPeering);
        return this;
    }

    @Override
    public ExpressRouteCircuitConnectionImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public ExpressRouteCircuitConnectionImpl withIpv6CircuitConnectionConfig(Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig) {
        this.inner().withIpv6CircuitConnectionConfig(ipv6CircuitConnectionConfig);
        return this;
    }

    @Override
    public ExpressRouteCircuitConnectionImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public ExpressRouteCircuitConnectionImpl withPeerExpressRouteCircuitPeering(SubResource peerExpressRouteCircuitPeering) {
        this.inner().withPeerExpressRouteCircuitPeering(peerExpressRouteCircuitPeering);
        return this;
    }

}
