// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provides parameter values to a magnitude scoring function.
 */
@Fluent
public final class MagnitudeScoringParameters {
    /*
     * The field value at which boosting starts.
     */
    @JsonProperty(value = "boostingRangeStart", required = true)
    private double boostingRangeStart;

    /*
     * The field value at which boosting ends.
     */
    @JsonProperty(value = "boostingRangeEnd", required = true)
    private double boostingRangeEnd;

    /*
     * A value indicating whether to apply a constant boost for field values
     * beyond the range end value; default is false.
     */
    @JsonProperty(value = "constantBoostBeyondRange")
    private Boolean shouldBoostBeyondRangeByConstant;

    /**
     * Get the boostingRangeStart property: The field value at which boosting
     * starts.
     *
     * @return the boostingRangeStart value.
     */
    public double getBoostingRangeStart() {
        return this.boostingRangeStart;
    }

    /**
     * Set the boostingRangeStart property: The field value at which boosting
     * starts.
     *
     * @param boostingRangeStart the boostingRangeStart value to set.
     * @return the MagnitudeScoringParameters object itself.
     */
    public MagnitudeScoringParameters setBoostingRangeStart(double boostingRangeStart) {
        this.boostingRangeStart = boostingRangeStart;
        return this;
    }

    /**
     * Get the boostingRangeEnd property: The field value at which boosting
     * ends.
     *
     * @return the boostingRangeEnd value.
     */
    public double getBoostingRangeEnd() {
        return this.boostingRangeEnd;
    }

    /**
     * Set the boostingRangeEnd property: The field value at which boosting
     * ends.
     *
     * @param boostingRangeEnd the boostingRangeEnd value to set.
     * @return the MagnitudeScoringParameters object itself.
     */
    public MagnitudeScoringParameters setBoostingRangeEnd(double boostingRangeEnd) {
        this.boostingRangeEnd = boostingRangeEnd;
        return this;
    }

    /**
     * Get the shouldBoostBeyondRangeByConstant property: A value indicating
     * whether to apply a constant boost for field values beyond the range end
     * value; default is false.
     *
     * @return the shouldBoostBeyondRangeByConstant value.
     */
    public Boolean isShouldBoostBeyondRangeByConstant() {
        return this.shouldBoostBeyondRangeByConstant;
    }

    /**
     * Set the shouldBoostBeyondRangeByConstant property: A value indicating
     * whether to apply a constant boost for field values beyond the range end
     * value; default is false.
     *
     * @param shouldBoostBeyondRangeByConstant the
     * shouldBoostBeyondRangeByConstant value to set.
     * @return the MagnitudeScoringParameters object itself.
     */
    public MagnitudeScoringParameters setShouldBoostBeyondRangeByConstant(Boolean shouldBoostBeyondRangeByConstant) {
        this.shouldBoostBeyondRangeByConstant = shouldBoostBeyondRangeByConstant;
        return this;
    }
}
