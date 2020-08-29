/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import rx.Completable;
import rx.Observable;

/**
 * Type representing TriggerRuns.
 */
public interface TriggerRuns {
    /**
     * Rerun single trigger instance by runId.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable rerunAsync(String resourceGroupName, String factoryName, String triggerName, String runId);

    /**
     * Cancel a single trigger instance by runId.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param triggerName The trigger name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAsync(String resourceGroupName, String factoryName, String triggerName, String runId);

    /**
     * Query trigger runs.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param filterParameters Parameters to filter the pipeline run.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TriggerRunsQueryResponse> queryByFactoryAsync(String resourceGroupName, String factoryName, RunFilterParameters filterParameters);

}
