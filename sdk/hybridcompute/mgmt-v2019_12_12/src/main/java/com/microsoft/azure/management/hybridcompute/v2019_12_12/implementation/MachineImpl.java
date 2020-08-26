/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridcompute.v2019_12_12.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.hybridcompute.v2019_12_12.Machine;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.hybridcompute.v2019_12_12.ErrorDetail;
import com.microsoft.azure.management.hybridcompute.v2019_12_12.MachineExtensionInstanceView;
import com.microsoft.azure.management.hybridcompute.v2019_12_12.MachineIdentity;
import org.joda.time.DateTime;
import com.microsoft.azure.management.hybridcompute.v2019_12_12.LocationData;
import com.microsoft.azure.management.hybridcompute.v2019_12_12.MachinePropertiesOsProfile;
import com.microsoft.azure.management.hybridcompute.v2019_12_12.StatusTypes;

class MachineImpl extends GroupableResourceCoreImpl<Machine, MachineInner, MachineImpl, HybridComputeManager> implements Machine {
    MachineImpl(String name, MachineInner inner, HybridComputeManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<Machine> createResourceAsync() {
        MachinesInner client = this.manager().inner().machines();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<Machine> updateResourceAsync() {
        MachinesInner client = this.manager().inner().machines();
        return null; // NOP updateResourceAsync implementation as update is not supported
    }

    @Override
    protected Observable<MachineInner> getInnerAsync() {
        MachinesInner client = this.manager().inner().machines();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }



    @Override
    public String agentVersion() {
        return this.inner().agentVersion();
    }

    @Override
    public String clientPublicKey() {
        return this.inner().clientPublicKey();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public List<ErrorDetail> errorDetails() {
        return this.inner().errorDetails();
    }

    @Override
    public List<MachineExtensionInstanceView> extensions() {
        return this.inner().extensions();
    }

    @Override
    public MachineIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public DateTime lastStatusChange() {
        return this.inner().lastStatusChange();
    }

    @Override
    public LocationData locationData() {
        return this.inner().locationData();
    }

    @Override
    public String machineFqdn() {
        return this.inner().machineFqdn();
    }

    @Override
    public String osName() {
        return this.inner().osName();
    }

    @Override
    public MachinePropertiesOsProfile osProfile() {
        return this.inner().osProfile();
    }

    @Override
    public String osVersion() {
        return this.inner().osVersion();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public StatusTypes status() {
        return this.inner().status();
    }

    @Override
    public String vmId() {
        return this.inner().vmId();
    }

}
