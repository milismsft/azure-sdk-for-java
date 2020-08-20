/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_06_01.implementation.FirewallPolicyRuleCollectionGroupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing FirewallPolicyRuleCollectionGroups.
 */
public interface FirewallPolicyRuleCollectionGroups extends SupportsCreating<FirewallPolicyRuleCollectionGroup.DefinitionStages.Blank>, HasInner<FirewallPolicyRuleCollectionGroupsInner> {
    /**
     * Gets the specified FirewallPolicyRuleCollectionGroup.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FirewallPolicyRuleCollectionGroup> getAsync(String resourceGroupName, String firewallPolicyName, String ruleCollectionGroupName);

    /**
     * Lists all FirewallPolicyRuleCollectionGroups in a FirewallPolicy resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FirewallPolicyRuleCollectionGroup> listAsync(final String resourceGroupName, final String firewallPolicyName);

    /**
     * Deletes the specified FirewallPolicyRuleCollectionGroup.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleCollectionGroupName The name of the FirewallPolicyRuleCollectionGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String firewallPolicyName, String ruleCollectionGroupName);

}
