/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.Table;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class TableImpl extends CreatableUpdatableImpl<Table, TableInner, TableImpl> implements Table, Table.Update {
    private final LogAnalyticsManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String tableName;
    private Integer uretentionInDays;

    TableImpl(String name, LogAnalyticsManager manager) {
        super(name, new TableInner());
        this.manager = manager;
        // Set resource name
        this.tableName = name;
        //
    }

    TableImpl(TableInner inner, LogAnalyticsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.tableName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourcegroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.tableName = IdParsingUtils.getValueFromIdByName(inner.id(), "tables");
        //
    }

    @Override
    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Table> createResourceAsync() {
        TablesInner client = this.manager().inner().tables();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<Table> updateResourceAsync() {
        TablesInner client = this.manager().inner().tables();
        return client.updateAsync(this.resourceGroupName, this.workspaceName, this.tableName, this.uretentionInDays)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<TableInner> getInnerAsync() {
        TablesInner client = this.manager().inner().tables();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.tableName);
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
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer retentionInDays() {
        return this.inner().retentionInDays();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public TableImpl withRetentionInDays(Integer retentionInDays) {
        this.uretentionInDays = retentionInDays;
        return this;
    }

}
