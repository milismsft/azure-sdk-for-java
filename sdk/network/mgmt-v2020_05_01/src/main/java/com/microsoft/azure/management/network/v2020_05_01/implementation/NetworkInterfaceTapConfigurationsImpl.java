/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_05_01.NetworkInterfaceTapConfigurations;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2020_05_01.NetworkInterfaceTapConfiguration;

class NetworkInterfaceTapConfigurationsImpl extends WrapperImpl<NetworkInterfaceTapConfigurationsInner> implements NetworkInterfaceTapConfigurations {
    private final NetworkManager manager;

    NetworkInterfaceTapConfigurationsImpl(NetworkManager manager) {
        super(manager.inner().networkInterfaceTapConfigurations());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public NetworkInterfaceTapConfigurationImpl define(String name) {
        return wrapModel(name);
    }

    private NetworkInterfaceTapConfigurationImpl wrapModel(NetworkInterfaceTapConfigurationInner inner) {
        return  new NetworkInterfaceTapConfigurationImpl(inner, manager());
    }

    private NetworkInterfaceTapConfigurationImpl wrapModel(String name) {
        return new NetworkInterfaceTapConfigurationImpl(name, this.manager());
    }

    @Override
    public Observable<NetworkInterfaceTapConfiguration> listAsync(final String resourceGroupName, final String networkInterfaceName) {
        NetworkInterfaceTapConfigurationsInner client = this.inner();
        return client.listAsync(resourceGroupName, networkInterfaceName)
        .flatMapIterable(new Func1<Page<NetworkInterfaceTapConfigurationInner>, Iterable<NetworkInterfaceTapConfigurationInner>>() {
            @Override
            public Iterable<NetworkInterfaceTapConfigurationInner> call(Page<NetworkInterfaceTapConfigurationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NetworkInterfaceTapConfigurationInner, NetworkInterfaceTapConfiguration>() {
            @Override
            public NetworkInterfaceTapConfiguration call(NetworkInterfaceTapConfigurationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<NetworkInterfaceTapConfiguration> getAsync(String resourceGroupName, String networkInterfaceName, String tapConfigurationName) {
        NetworkInterfaceTapConfigurationsInner client = this.inner();
        return client.getAsync(resourceGroupName, networkInterfaceName, tapConfigurationName)
        .flatMap(new Func1<NetworkInterfaceTapConfigurationInner, Observable<NetworkInterfaceTapConfiguration>>() {
            @Override
            public Observable<NetworkInterfaceTapConfiguration> call(NetworkInterfaceTapConfigurationInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((NetworkInterfaceTapConfiguration)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String networkInterfaceName, String tapConfigurationName) {
        NetworkInterfaceTapConfigurationsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, networkInterfaceName, tapConfigurationName).toCompletable();
    }

}
