/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.appplatform.v2020_07_01.implementation;

import com.microsoft.azure.management.appplatform.v2020_07_01.AppResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.appplatform.v2020_07_01.AppResourceProperties;
import com.microsoft.azure.management.appplatform.v2020_07_01.ManagedIdentityProperties;

class AppResourceImpl extends CreatableUpdatableImpl<AppResource, AppResourceInner, AppResourceImpl> implements AppResource, AppResource.Definition, AppResource.Update {
    private String resourceGroupName;
    private String serviceName;
    private String appName;
    private final AppPlatformManager manager;

    AppResourceImpl(String name, AppPlatformManager manager) {
        super(name, new AppResourceInner());
        this.manager = manager;
        // Set resource name
        this.appName = name;
        //
    }

    AppResourceImpl(AppResourceInner inner, AppPlatformManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.appName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "Spring");
        this.appName = IdParsingUtils.getValueFromIdByName(inner.id(), "apps");
        // set other parameters for create and update
    }

    @Override
    public AppPlatformManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AppResource> createResourceAsync() {
        AppsInner client = this.manager().inner().apps();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.appName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AppResource> updateResourceAsync() {
        AppsInner client = this.manager().inner().apps();
        return client.updateAsync(this.resourceGroupName, this.serviceName, this.appName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AppResourceInner> getInnerAsync() {
        AppsInner client = this.manager().inner().apps();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ManagedIdentityProperties identity() {
        return this.inner().identity();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public AppResourceProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public AppResourceImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public AppResourceImpl withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    @Override
    public AppResourceImpl withIdentity(ManagedIdentityProperties identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public AppResourceImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public AppResourceImpl withProperties(AppResourceProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

}
