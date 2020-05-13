// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DataMaskingRuleListResult model. */
@Fluent
public final class DataMaskingRuleListResultInner {
    /*
     * The list of database data masking rules.
     */
    @JsonProperty(value = "value")
    private List<DataMaskingRuleInner> value;

    /**
     * Get the value property: The list of database data masking rules.
     *
     * @return the value value.
     */
    public List<DataMaskingRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of database data masking rules.
     *
     * @param value the value value to set.
     * @return the DataMaskingRuleListResultInner object itself.
     */
    public DataMaskingRuleListResultInner withValue(List<DataMaskingRuleInner> value) {
        this.value = value;
        return this;
    }
}
