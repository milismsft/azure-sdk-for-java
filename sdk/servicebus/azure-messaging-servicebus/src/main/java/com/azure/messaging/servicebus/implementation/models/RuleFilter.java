// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The RuleFilter model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = RuleFilter.class)
@JsonTypeName("RuleFilter")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "CorrelationFilter", value = CorrelationFilter.class),
    @JsonSubTypes.Type(name = "SqlFilter", value = SqlFilter.class)
})
@JacksonXmlRootElement(
        localName = "Filter",
        namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
@Immutable
public class RuleFilter {
}
