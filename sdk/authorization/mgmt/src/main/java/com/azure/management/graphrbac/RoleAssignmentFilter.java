// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RoleAssignmentFilter model. */
@Fluent
public final class RoleAssignmentFilter {
    /*
     * Returns role assignment of the specific principal.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /*
     * The Delegation flag for the role assignment
     */
    @JsonProperty(value = "canDelegate")
    private Boolean canDelegate;

    /**
     * Get the principalId property: Returns role assignment of the specific principal.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: Returns role assignment of the specific principal.
     *
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentFilter object itself.
     */
    public RoleAssignmentFilter withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the canDelegate property: The Delegation flag for the role assignment.
     *
     * @return the canDelegate value.
     */
    public Boolean canDelegate() {
        return this.canDelegate;
    }

    /**
     * Set the canDelegate property: The Delegation flag for the role assignment.
     *
     * @param canDelegate the canDelegate value to set.
     * @return the RoleAssignmentFilter object itself.
     */
    public RoleAssignmentFilter withCanDelegate(Boolean canDelegate) {
        this.canDelegate = canDelegate;
        return this;
    }
}
