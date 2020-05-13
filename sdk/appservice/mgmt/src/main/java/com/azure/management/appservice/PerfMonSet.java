// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The PerfMonSet model. */
@Fluent
public final class PerfMonSet {
    /*
     * Unique key name of the counter.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Start time of the period.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * End time of the period.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * Presented time grain.
     */
    @JsonProperty(value = "timeGrain")
    private String timeGrain;

    /*
     * Collection of workers that are active during this time.
     */
    @JsonProperty(value = "values")
    private List<PerfMonSample> values;

    /**
     * Get the name property: Unique key name of the counter.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Unique key name of the counter.
     *
     * @param name the name value to set.
     * @return the PerfMonSet object itself.
     */
    public PerfMonSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the startTime property: Start time of the period.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of the period.
     *
     * @param startTime the startTime value to set.
     * @return the PerfMonSet object itself.
     */
    public PerfMonSet withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: End time of the period.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time of the period.
     *
     * @param endTime the endTime value to set.
     * @return the PerfMonSet object itself.
     */
    public PerfMonSet withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the timeGrain property: Presented time grain.
     *
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the timeGrain property: Presented time grain.
     *
     * @param timeGrain the timeGrain value to set.
     * @return the PerfMonSet object itself.
     */
    public PerfMonSet withTimeGrain(String timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the values property: Collection of workers that are active during this time.
     *
     * @return the values value.
     */
    public List<PerfMonSample> values() {
        return this.values;
    }

    /**
     * Set the values property: Collection of workers that are active during this time.
     *
     * @param values the values value to set.
     * @return the PerfMonSet object itself.
     */
    public PerfMonSet withValues(List<PerfMonSample> values) {
        this.values = values;
        return this;
    }
}
