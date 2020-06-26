/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_05_01.IpGroup;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_05_01.ProvisioningState;
import java.util.List;
import com.microsoft.azure.SubResource;

class IpGroupImpl extends GroupableResourceCoreImpl<IpGroup, IpGroupInner, IpGroupImpl, NetworkManager> implements IpGroup, IpGroup.Definition, IpGroup.Update {
    IpGroupImpl(String name, IpGroupInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<IpGroup> createResourceAsync() {
        IpGroupsInner client = this.manager().inner().ipGroups();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<IpGroup> updateResourceAsync() {
        IpGroupsInner client = this.manager().inner().ipGroups();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<IpGroupInner> getInnerAsync() {
        IpGroupsInner client = this.manager().inner().ipGroups();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<SubResource> firewalls() {
        return this.inner().firewalls();
    }

    @Override
    public List<String> ipAddresses() {
        return this.inner().ipAddresses();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public IpGroupImpl withIpAddresses(List<String> ipAddresses) {
        this.inner().withIpAddresses(ipAddresses);
        return this;
    }

}
