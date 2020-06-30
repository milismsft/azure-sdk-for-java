/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15.implementation;

import com.microsoft.azure.management.cdn.v2020_04_15.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cdn.v2020_04_15.OperationDisplay;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final CdnManager manager;
    OperationImpl(OperationInner inner, CdnManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public OperationDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
