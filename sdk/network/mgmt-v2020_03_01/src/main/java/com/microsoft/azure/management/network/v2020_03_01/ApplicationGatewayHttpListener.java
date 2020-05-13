/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.microsoft.azure.SubResource;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Http listener of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayHttpListener extends SubResource {
    /**
     * Frontend IP configuration resource of an application gateway.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIPConfiguration;

    /**
     * Frontend port resource of an application gateway.
     */
    @JsonProperty(value = "properties.frontendPort")
    private SubResource frontendPort;

    /**
     * Protocol of the HTTP listener. Possible values include: 'Http', 'Https'.
     */
    @JsonProperty(value = "properties.protocol")
    private ApplicationGatewayProtocol protocol;

    /**
     * Host name of HTTP listener.
     */
    @JsonProperty(value = "properties.hostName")
    private String hostName;

    /**
     * SSL certificate resource of an application gateway.
     */
    @JsonProperty(value = "properties.sslCertificate")
    private SubResource sslCertificate;

    /**
     * Applicable only if protocol is https. Enables SNI for multi-hosting.
     */
    @JsonProperty(value = "properties.requireServerNameIndication")
    private Boolean requireServerNameIndication;

    /**
     * The provisioning state of the HTTP listener resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Custom error configurations of the HTTP listener.
     */
    @JsonProperty(value = "properties.customErrorConfigurations")
    private List<ApplicationGatewayCustomError> customErrorConfigurations;

    /**
     * Reference to the FirewallPolicy resource.
     */
    @JsonProperty(value = "properties.firewallPolicy")
    private SubResource firewallPolicy;

    /**
     * List of Host names for HTTP Listener that allows special wildcard
     * characters as well.
     */
    @JsonProperty(value = "properties.hostNames")
    private List<String> hostNames;

    /**
     * Name of the HTTP listener that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get frontend IP configuration resource of an application gateway.
     *
     * @return the frontendIPConfiguration value
     */
    public SubResource frontendIPConfiguration() {
        return this.frontendIPConfiguration;
    }

    /**
     * Set frontend IP configuration resource of an application gateway.
     *
     * @param frontendIPConfiguration the frontendIPConfiguration value to set
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withFrontendIPConfiguration(SubResource frontendIPConfiguration) {
        this.frontendIPConfiguration = frontendIPConfiguration;
        return this;
    }

    /**
     * Get frontend port resource of an application gateway.
     *
     * @return the frontendPort value
     */
    public SubResource frontendPort() {
        return this.frontendPort;
    }

    /**
     * Set frontend port resource of an application gateway.
     *
     * @param frontendPort the frontendPort value to set
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withFrontendPort(SubResource frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }

    /**
     * Get protocol of the HTTP listener. Possible values include: 'Http', 'Https'.
     *
     * @return the protocol value
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set protocol of the HTTP listener. Possible values include: 'Http', 'Https'.
     *
     * @param protocol the protocol value to set
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get host name of HTTP listener.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Set host name of HTTP listener.
     *
     * @param hostName the hostName value to set
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get sSL certificate resource of an application gateway.
     *
     * @return the sslCertificate value
     */
    public SubResource sslCertificate() {
        return this.sslCertificate;
    }

    /**
     * Set sSL certificate resource of an application gateway.
     *
     * @param sslCertificate the sslCertificate value to set
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withSslCertificate(SubResource sslCertificate) {
        this.sslCertificate = sslCertificate;
        return this;
    }

    /**
     * Get applicable only if protocol is https. Enables SNI for multi-hosting.
     *
     * @return the requireServerNameIndication value
     */
    public Boolean requireServerNameIndication() {
        return this.requireServerNameIndication;
    }

    /**
     * Set applicable only if protocol is https. Enables SNI for multi-hosting.
     *
     * @param requireServerNameIndication the requireServerNameIndication value to set
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withRequireServerNameIndication(Boolean requireServerNameIndication) {
        this.requireServerNameIndication = requireServerNameIndication;
        return this;
    }

    /**
     * Get the provisioning state of the HTTP listener resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get custom error configurations of the HTTP listener.
     *
     * @return the customErrorConfigurations value
     */
    public List<ApplicationGatewayCustomError> customErrorConfigurations() {
        return this.customErrorConfigurations;
    }

    /**
     * Set custom error configurations of the HTTP listener.
     *
     * @param customErrorConfigurations the customErrorConfigurations value to set
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withCustomErrorConfigurations(List<ApplicationGatewayCustomError> customErrorConfigurations) {
        this.customErrorConfigurations = customErrorConfigurations;
        return this;
    }

    /**
     * Get reference to the FirewallPolicy resource.
     *
     * @return the firewallPolicy value
     */
    public SubResource firewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * Set reference to the FirewallPolicy resource.
     *
     * @param firewallPolicy the firewallPolicy value to set
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withFirewallPolicy(SubResource firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
        return this;
    }

    /**
     * Get list of Host names for HTTP Listener that allows special wildcard characters as well.
     *
     * @return the hostNames value
     */
    public List<String> hostNames() {
        return this.hostNames;
    }

    /**
     * Set list of Host names for HTTP Listener that allows special wildcard characters as well.
     *
     * @param hostNames the hostNames value to set
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withHostNames(List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }

    /**
     * Get name of the HTTP listener that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the HTTP listener that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
