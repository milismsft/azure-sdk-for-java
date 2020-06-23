/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.WorkspacePurgeStatusResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.PurgeState;

class WorkspacePurgeStatusResponseImpl extends WrapperImpl<WorkspacePurgeStatusResponseInner> implements WorkspacePurgeStatusResponse {
    private final LogAnalyticsManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String purgeId;

    WorkspacePurgeStatusResponseImpl(WorkspacePurgeStatusResponseInner inner,  LogAnalyticsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LogAnalyticsManager manager() {
        return this.manager;
    }



    @Override
    public PurgeState status() {
        return this.inner().status();
    }

}
