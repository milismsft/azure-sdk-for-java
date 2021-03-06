/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_10_31;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.digitaltwins.v2020_10_31.implementation.DigitalTwinsManager;
import com.microsoft.azure.management.digitaltwins.v2020_10_31.implementation.CheckNameResultInner;

/**
 * Type representing CheckNameResult.
 */
public interface CheckNameResult extends HasInner<CheckNameResultInner>, HasManager<DigitalTwinsManager> {
    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * @return the reason value.
     */
    Reason reason();

}
