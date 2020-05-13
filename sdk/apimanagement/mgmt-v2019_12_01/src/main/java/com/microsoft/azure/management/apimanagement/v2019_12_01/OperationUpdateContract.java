/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Api Operation Update Contract details.
 */
@JsonFlatten
public class OperationUpdateContract {
    /**
     * Collection of URL template parameters.
     */
    @JsonProperty(value = "properties.templateParameters")
    private List<ParameterContract> templateParameters;

    /**
     * Description of the operation. May include HTML formatting tags.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * An entity containing request details.
     */
    @JsonProperty(value = "properties.request")
    private RequestContract request;

    /**
     * Array of Operation responses.
     */
    @JsonProperty(value = "properties.responses")
    private List<ResponseContract> responses;

    /**
     * Operation Policies.
     */
    @JsonProperty(value = "properties.policies")
    private String policies;

    /**
     * Operation Name.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST
     * but not limited by only them.
     */
    @JsonProperty(value = "properties.method")
    private String method;

    /**
     * Relative URL template identifying the target resource for this
     * operation. May include parameters. Example:
     * /customers/{cid}/orders/{oid}/?date={date}.
     */
    @JsonProperty(value = "properties.urlTemplate")
    private String urlTemplate;

    /**
     * Get collection of URL template parameters.
     *
     * @return the templateParameters value
     */
    public List<ParameterContract> templateParameters() {
        return this.templateParameters;
    }

    /**
     * Set collection of URL template parameters.
     *
     * @param templateParameters the templateParameters value to set
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withTemplateParameters(List<ParameterContract> templateParameters) {
        this.templateParameters = templateParameters;
        return this;
    }

    /**
     * Get description of the operation. May include HTML formatting tags.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the operation. May include HTML formatting tags.
     *
     * @param description the description value to set
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get an entity containing request details.
     *
     * @return the request value
     */
    public RequestContract request() {
        return this.request;
    }

    /**
     * Set an entity containing request details.
     *
     * @param request the request value to set
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withRequest(RequestContract request) {
        this.request = request;
        return this;
    }

    /**
     * Get array of Operation responses.
     *
     * @return the responses value
     */
    public List<ResponseContract> responses() {
        return this.responses;
    }

    /**
     * Set array of Operation responses.
     *
     * @param responses the responses value to set
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withResponses(List<ResponseContract> responses) {
        this.responses = responses;
        return this;
    }

    /**
     * Get operation Policies.
     *
     * @return the policies value
     */
    public String policies() {
        return this.policies;
    }

    /**
     * Set operation Policies.
     *
     * @param policies the policies value to set
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withPolicies(String policies) {
        this.policies = policies;
        return this;
    }

    /**
     * Get operation Name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set operation Name.
     *
     * @param displayName the displayName value to set
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get a Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST but not limited by only them.
     *
     * @return the method value
     */
    public String method() {
        return this.method;
    }

    /**
     * Set a Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST but not limited by only them.
     *
     * @param method the method value to set
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * Get relative URL template identifying the target resource for this operation. May include parameters. Example: /customers/{cid}/orders/{oid}/?date={date}.
     *
     * @return the urlTemplate value
     */
    public String urlTemplate() {
        return this.urlTemplate;
    }

    /**
     * Set relative URL template identifying the target resource for this operation. May include parameters. Example: /customers/{cid}/orders/{oid}/?date={date}.
     *
     * @param urlTemplate the urlTemplate value to set
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withUrlTemplate(String urlTemplate) {
        this.urlTemplate = urlTemplate;
        return this;
    }

}
