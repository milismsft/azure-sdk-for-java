/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_06_01.IpAllocation;
import rx.Observable;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_06_01.IpAllocationType;
import com.microsoft.azure.management.network.v2020_06_01.IPVersion;
import java.util.Map;

class IpAllocationImpl extends GroupableResourceCoreImpl<IpAllocation, IpAllocationInner, IpAllocationImpl, NetworkManager> implements IpAllocation, IpAllocation.Definition, IpAllocation.Update {
    IpAllocationImpl(String name, IpAllocationInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<IpAllocation> createResourceAsync() {
        IpAllocationsInner client = this.manager().inner().ipAllocations();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<IpAllocation> updateResourceAsync() {
        IpAllocationsInner client = this.manager().inner().ipAllocations();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<IpAllocationInner> getInnerAsync() {
        IpAllocationsInner client = this.manager().inner().ipAllocations();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Map<String, String> allocationTags() {
        return this.inner().allocationTags();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public IpAllocationType ipAllocationType() {
        return this.inner().ipAllocationType();
    }

    @Override
    public String ipamAllocationId() {
        return this.inner().ipamAllocationId();
    }

    @Override
    public String prefix() {
        return this.inner().prefix();
    }

    @Override
    public Integer prefixLength() {
        return this.inner().prefixLength();
    }

    @Override
    public IPVersion prefixType() {
        return this.inner().prefixType();
    }

    @Override
    public SubResource subnet() {
        return this.inner().subnet();
    }

    @Override
    public SubResource virtualNetwork() {
        return this.inner().virtualNetwork();
    }

    @Override
    public IpAllocationImpl withAllocationTags(Map<String, String> allocationTags) {
        this.inner().withAllocationTags(allocationTags);
        return this;
    }

    @Override
    public IpAllocationImpl withIpAllocationType(IpAllocationType ipAllocationType) {
        this.inner().withIpAllocationType(ipAllocationType);
        return this;
    }

    @Override
    public IpAllocationImpl withIpamAllocationId(String ipamAllocationId) {
        this.inner().withIpamAllocationId(ipamAllocationId);
        return this;
    }

    @Override
    public IpAllocationImpl withPrefix(String prefix) {
        this.inner().withPrefix(prefix);
        return this;
    }

    @Override
    public IpAllocationImpl withPrefixLength(Integer prefixLength) {
        this.inner().withPrefixLength(prefixLength);
        return this;
    }

    @Override
    public IpAllocationImpl withPrefixType(IPVersion prefixType) {
        this.inner().withPrefixType(prefixType);
        return this;
    }

}
