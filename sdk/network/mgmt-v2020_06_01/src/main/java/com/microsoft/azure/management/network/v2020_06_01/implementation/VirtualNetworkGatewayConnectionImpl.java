/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_06_01.VirtualNetworkGatewayConnection;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_06_01.VirtualNetworkGatewayConnectionType;
import com.microsoft.azure.management.network.v2020_06_01.VirtualNetworkGatewayConnectionProtocol;
import com.microsoft.azure.management.network.v2020_06_01.VirtualNetworkGatewayConnectionStatus;
import java.util.List;
import com.microsoft.azure.management.network.v2020_06_01.TunnelConnectionHealth;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_06_01.IpsecPolicy;
import com.microsoft.azure.management.network.v2020_06_01.TrafficSelectorPolicy;
import com.microsoft.azure.management.network.v2020_06_01.ProvisioningState;
import com.microsoft.azure.management.network.v2020_06_01.LocalNetworkGateway;
import com.microsoft.azure.management.network.v2020_06_01.VirtualNetworkGateway;

class VirtualNetworkGatewayConnectionImpl extends GroupableResourceCoreImpl<VirtualNetworkGatewayConnection, VirtualNetworkGatewayConnectionInner, VirtualNetworkGatewayConnectionImpl, NetworkManager> implements VirtualNetworkGatewayConnection, VirtualNetworkGatewayConnection.Definition, VirtualNetworkGatewayConnection.Update {
    VirtualNetworkGatewayConnectionImpl(String name, VirtualNetworkGatewayConnectionInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<VirtualNetworkGatewayConnection> createResourceAsync() {
        VirtualNetworkGatewayConnectionsInner client = this.manager().inner().virtualNetworkGatewayConnections();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualNetworkGatewayConnection> updateResourceAsync() {
        VirtualNetworkGatewayConnectionsInner client = this.manager().inner().virtualNetworkGatewayConnections();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualNetworkGatewayConnectionInner> getInnerAsync() {
        VirtualNetworkGatewayConnectionsInner client = this.manager().inner().virtualNetworkGatewayConnections();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String authorizationKey() {
        return this.inner().authorizationKey();
    }

    @Override
    public VirtualNetworkGatewayConnectionProtocol connectionProtocol() {
        return this.inner().connectionProtocol();
    }

    @Override
    public VirtualNetworkGatewayConnectionStatus connectionStatus() {
        return this.inner().connectionStatus();
    }

    @Override
    public VirtualNetworkGatewayConnectionType connectionType() {
        return this.inner().connectionType();
    }

    @Override
    public Integer dpdTimeoutSeconds() {
        return this.inner().dpdTimeoutSeconds();
    }

    @Override
    public Long egressBytesTransferred() {
        return this.inner().egressBytesTransferred();
    }

    @Override
    public Boolean enableBgp() {
        return this.inner().enableBgp();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public Boolean expressRouteGatewayBypass() {
        return this.inner().expressRouteGatewayBypass();
    }

    @Override
    public Long ingressBytesTransferred() {
        return this.inner().ingressBytesTransferred();
    }

    @Override
    public List<IpsecPolicy> ipsecPolicies() {
        return this.inner().ipsecPolicies();
    }

    @Override
    public LocalNetworkGateway localNetworkGateway2() {
        LocalNetworkGatewayInner inner = this.inner().localNetworkGateway2();
        if (inner != null) {
            return  new LocalNetworkGatewayImpl(inner.name(), inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public SubResource peer() {
        return this.inner().peer();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public Integer routingWeight() {
        return this.inner().routingWeight();
    }

    @Override
    public String sharedKey() {
        return this.inner().sharedKey();
    }

    @Override
    public List<TrafficSelectorPolicy> trafficSelectorPolicies() {
        return this.inner().trafficSelectorPolicies();
    }

    @Override
    public List<TunnelConnectionHealth> tunnelConnectionStatus() {
        return this.inner().tunnelConnectionStatus();
    }

    @Override
    public Boolean useLocalAzureIpAddress() {
        return this.inner().useLocalAzureIpAddress();
    }

    @Override
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.inner().usePolicyBasedTrafficSelectors();
    }

    @Override
    public VirtualNetworkGateway virtualNetworkGateway1() {
        VirtualNetworkGatewayInner inner = this.inner().virtualNetworkGateway1();
        if (inner != null) {
            return  new VirtualNetworkGatewayImpl(inner.name(), inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public VirtualNetworkGateway virtualNetworkGateway2() {
        VirtualNetworkGatewayInner inner = this.inner().virtualNetworkGateway2();
        if (inner != null) {
            return  new VirtualNetworkGatewayImpl(inner.name(), inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withConnectionType(VirtualNetworkGatewayConnectionType connectionType) {
        this.inner().withConnectionType(connectionType);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withVirtualNetworkGateway1(VirtualNetworkGatewayInner virtualNetworkGateway1) {
        this.inner().withVirtualNetworkGateway1(virtualNetworkGateway1);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withAuthorizationKey(String authorizationKey) {
        this.inner().withAuthorizationKey(authorizationKey);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withConnectionProtocol(VirtualNetworkGatewayConnectionProtocol connectionProtocol) {
        this.inner().withConnectionProtocol(connectionProtocol);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withDpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
        this.inner().withDpdTimeoutSeconds(dpdTimeoutSeconds);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withEnableBgp(Boolean enableBgp) {
        this.inner().withEnableBgp(enableBgp);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withExpressRouteGatewayBypass(Boolean expressRouteGatewayBypass) {
        this.inner().withExpressRouteGatewayBypass(expressRouteGatewayBypass);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        this.inner().withIpsecPolicies(ipsecPolicies);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withLocalNetworkGateway2(LocalNetworkGatewayInner localNetworkGateway2) {
        this.inner().withLocalNetworkGateway2(localNetworkGateway2);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withPeer(SubResource peer) {
        this.inner().withPeer(peer);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withRoutingWeight(Integer routingWeight) {
        this.inner().withRoutingWeight(routingWeight);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withSharedKey(String sharedKey) {
        this.inner().withSharedKey(sharedKey);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withTrafficSelectorPolicies(List<TrafficSelectorPolicy> trafficSelectorPolicies) {
        this.inner().withTrafficSelectorPolicies(trafficSelectorPolicies);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withUseLocalAzureIpAddress(Boolean useLocalAzureIpAddress) {
        this.inner().withUseLocalAzureIpAddress(useLocalAzureIpAddress);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors) {
        this.inner().withUsePolicyBasedTrafficSelectors(usePolicyBasedTrafficSelectors);
        return this;
    }

    @Override
    public VirtualNetworkGatewayConnectionImpl withVirtualNetworkGateway2(VirtualNetworkGatewayInner virtualNetworkGateway2) {
        this.inner().withVirtualNetworkGateway2(virtualNetworkGateway2);
        return this;
    }

}
