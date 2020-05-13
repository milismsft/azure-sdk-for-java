/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_03_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_03_01.implementation.LocalNetworkGatewayInner;
import com.microsoft.azure.management.network.v2020_03_01.implementation.VirtualNetworkGatewayInner;
import com.microsoft.azure.management.network.v2020_03_01.implementation.VirtualNetworkGatewayConnectionInner;

/**
 * Type representing VirtualNetworkGatewayConnection.
 */
public interface VirtualNetworkGatewayConnection extends HasInner<VirtualNetworkGatewayConnectionInner>, Resource, GroupableResourceCore<NetworkManager, VirtualNetworkGatewayConnectionInner>, HasResourceGroup, Refreshable<VirtualNetworkGatewayConnection>, Updatable<VirtualNetworkGatewayConnection.Update>, HasManager<NetworkManager> {
    /**
     * @return the authorizationKey value.
     */
    String authorizationKey();

    /**
     * @return the connectionProtocol value.
     */
    VirtualNetworkGatewayConnectionProtocol connectionProtocol();

    /**
     * @return the connectionStatus value.
     */
    VirtualNetworkGatewayConnectionStatus connectionStatus();

    /**
     * @return the connectionType value.
     */
    VirtualNetworkGatewayConnectionType connectionType();

    /**
     * @return the dpdTimeoutSeconds value.
     */
    Integer dpdTimeoutSeconds();

    /**
     * @return the egressBytesTransferred value.
     */
    Long egressBytesTransferred();

    /**
     * @return the enableBgp value.
     */
    Boolean enableBgp();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the expressRouteGatewayBypass value.
     */
    Boolean expressRouteGatewayBypass();

    /**
     * @return the ingressBytesTransferred value.
     */
    Long ingressBytesTransferred();

    /**
     * @return the ipsecPolicies value.
     */
    List<IpsecPolicy> ipsecPolicies();

    /**
     * @return the localNetworkGateway2 value.
     */
    LocalNetworkGateway localNetworkGateway2();

    /**
     * @return the peer value.
     */
    SubResource peer();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * @return the routingWeight value.
     */
    Integer routingWeight();

    /**
     * @return the sharedKey value.
     */
    String sharedKey();

    /**
     * @return the trafficSelectorPolicies value.
     */
    List<TrafficSelectorPolicy> trafficSelectorPolicies();

    /**
     * @return the tunnelConnectionStatus value.
     */
    List<TunnelConnectionHealth> tunnelConnectionStatus();

    /**
     * @return the useLocalAzureIpAddress value.
     */
    Boolean useLocalAzureIpAddress();

    /**
     * @return the usePolicyBasedTrafficSelectors value.
     */
    Boolean usePolicyBasedTrafficSelectors();

    /**
     * @return the virtualNetworkGateway1 value.
     */
    VirtualNetworkGateway virtualNetworkGateway1();

    /**
     * @return the virtualNetworkGateway2 value.
     */
    VirtualNetworkGateway virtualNetworkGateway2();

    /**
     * The entirety of the VirtualNetworkGatewayConnection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithConnectionType, DefinitionStages.WithVirtualNetworkGateway1, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualNetworkGatewayConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualNetworkGatewayConnection definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the VirtualNetworkGatewayConnection definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithConnectionType> {
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify ConnectionType.
         */
        interface WithConnectionType {
           /**
            * Specifies connectionType.
            * @param connectionType Gateway connection type. Possible values include: 'IPsec', 'Vnet2Vnet', 'ExpressRoute', 'VPNClient'
            * @return the next definition stage
*/
            WithVirtualNetworkGateway1 withConnectionType(VirtualNetworkGatewayConnectionType connectionType);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify VirtualNetworkGateway1.
         */
        interface WithVirtualNetworkGateway1 {
           /**
            * Specifies virtualNetworkGateway1.
            * @param virtualNetworkGateway1 The reference to virtual network gateway resource
            * @return the next definition stage
*/
            WithCreate withVirtualNetworkGateway1(VirtualNetworkGatewayInner virtualNetworkGateway1);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify AuthorizationKey.
         */
        interface WithAuthorizationKey {
            /**
             * Specifies authorizationKey.
             * @param authorizationKey The authorizationKey
             * @return the next definition stage
             */
            WithCreate withAuthorizationKey(String authorizationKey);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify ConnectionProtocol.
         */
        interface WithConnectionProtocol {
            /**
             * Specifies connectionProtocol.
             * @param connectionProtocol Connection protocol used for this connection. Possible values include: 'IKEv2', 'IKEv1'
             * @return the next definition stage
             */
            WithCreate withConnectionProtocol(VirtualNetworkGatewayConnectionProtocol connectionProtocol);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify DpdTimeoutSeconds.
         */
        interface WithDpdTimeoutSeconds {
            /**
             * Specifies dpdTimeoutSeconds.
             * @param dpdTimeoutSeconds The dead peer detection timeout of this connection in seconds
             * @return the next definition stage
             */
            WithCreate withDpdTimeoutSeconds(Integer dpdTimeoutSeconds);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify EnableBgp.
         */
        interface WithEnableBgp {
            /**
             * Specifies enableBgp.
             * @param enableBgp EnableBgp flag
             * @return the next definition stage
             */
            WithCreate withEnableBgp(Boolean enableBgp);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify ExpressRouteGatewayBypass.
         */
        interface WithExpressRouteGatewayBypass {
            /**
             * Specifies expressRouteGatewayBypass.
             * @param expressRouteGatewayBypass Bypass ExpressRoute Gateway for data forwarding
             * @return the next definition stage
             */
            WithCreate withExpressRouteGatewayBypass(Boolean expressRouteGatewayBypass);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify IpsecPolicies.
         */
        interface WithIpsecPolicies {
            /**
             * Specifies ipsecPolicies.
             * @param ipsecPolicies The IPSec Policies to be considered by this connection
             * @return the next definition stage
             */
            WithCreate withIpsecPolicies(List<IpsecPolicy> ipsecPolicies);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify LocalNetworkGateway2.
         */
        interface WithLocalNetworkGateway2 {
            /**
             * Specifies localNetworkGateway2.
             * @param localNetworkGateway2 The reference to local network gateway resource
             * @return the next definition stage
             */
            WithCreate withLocalNetworkGateway2(LocalNetworkGatewayInner localNetworkGateway2);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify Peer.
         */
        interface WithPeer {
            /**
             * Specifies peer.
             * @param peer The reference to peerings resource
             * @return the next definition stage
             */
            WithCreate withPeer(SubResource peer);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify RoutingWeight.
         */
        interface WithRoutingWeight {
            /**
             * Specifies routingWeight.
             * @param routingWeight The routing weight
             * @return the next definition stage
             */
            WithCreate withRoutingWeight(Integer routingWeight);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify SharedKey.
         */
        interface WithSharedKey {
            /**
             * Specifies sharedKey.
             * @param sharedKey The IPSec shared key
             * @return the next definition stage
             */
            WithCreate withSharedKey(String sharedKey);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify TrafficSelectorPolicies.
         */
        interface WithTrafficSelectorPolicies {
            /**
             * Specifies trafficSelectorPolicies.
             * @param trafficSelectorPolicies The Traffic Selector Policies to be considered by this connection
             * @return the next definition stage
             */
            WithCreate withTrafficSelectorPolicies(List<TrafficSelectorPolicy> trafficSelectorPolicies);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify UseLocalAzureIpAddress.
         */
        interface WithUseLocalAzureIpAddress {
            /**
             * Specifies useLocalAzureIpAddress.
             * @param useLocalAzureIpAddress Use private local Azure IP for the connection
             * @return the next definition stage
             */
            WithCreate withUseLocalAzureIpAddress(Boolean useLocalAzureIpAddress);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify UsePolicyBasedTrafficSelectors.
         */
        interface WithUsePolicyBasedTrafficSelectors {
            /**
             * Specifies usePolicyBasedTrafficSelectors.
             * @param usePolicyBasedTrafficSelectors Enable policy-based traffic selectors
             * @return the next definition stage
             */
            WithCreate withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection definition allowing to specify VirtualNetworkGateway2.
         */
        interface WithVirtualNetworkGateway2 {
            /**
             * Specifies virtualNetworkGateway2.
             * @param virtualNetworkGateway2 The reference to virtual network gateway resource
             * @return the next definition stage
             */
            WithCreate withVirtualNetworkGateway2(VirtualNetworkGatewayInner virtualNetworkGateway2);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualNetworkGatewayConnection>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAuthorizationKey, DefinitionStages.WithConnectionProtocol, DefinitionStages.WithDpdTimeoutSeconds, DefinitionStages.WithEnableBgp, DefinitionStages.WithExpressRouteGatewayBypass, DefinitionStages.WithIpsecPolicies, DefinitionStages.WithLocalNetworkGateway2, DefinitionStages.WithPeer, DefinitionStages.WithRoutingWeight, DefinitionStages.WithSharedKey, DefinitionStages.WithTrafficSelectorPolicies, DefinitionStages.WithUseLocalAzureIpAddress, DefinitionStages.WithUsePolicyBasedTrafficSelectors, DefinitionStages.WithVirtualNetworkGateway2 {
        }
    }
    /**
     * The template for a VirtualNetworkGatewayConnection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualNetworkGatewayConnection>, Resource.UpdateWithTags<Update>, UpdateStages.WithAuthorizationKey, UpdateStages.WithConnectionProtocol, UpdateStages.WithDpdTimeoutSeconds, UpdateStages.WithEnableBgp, UpdateStages.WithExpressRouteGatewayBypass, UpdateStages.WithIpsecPolicies, UpdateStages.WithLocalNetworkGateway2, UpdateStages.WithPeer, UpdateStages.WithRoutingWeight, UpdateStages.WithSharedKey, UpdateStages.WithTrafficSelectorPolicies, UpdateStages.WithUseLocalAzureIpAddress, UpdateStages.WithUsePolicyBasedTrafficSelectors, UpdateStages.WithVirtualNetworkGateway2 {
    }

    /**
     * Grouping of VirtualNetworkGatewayConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualnetworkgatewayconnection update allowing to specify AuthorizationKey.
         */
        interface WithAuthorizationKey {
            /**
             * Specifies authorizationKey.
             * @param authorizationKey The authorizationKey
             * @return the next update stage
             */
            Update withAuthorizationKey(String authorizationKey);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection update allowing to specify ConnectionProtocol.
         */
        interface WithConnectionProtocol {
            /**
             * Specifies connectionProtocol.
             * @param connectionProtocol Connection protocol used for this connection. Possible values include: 'IKEv2', 'IKEv1'
             * @return the next update stage
             */
            Update withConnectionProtocol(VirtualNetworkGatewayConnectionProtocol connectionProtocol);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection update allowing to specify DpdTimeoutSeconds.
         */
        interface WithDpdTimeoutSeconds {
            /**
             * Specifies dpdTimeoutSeconds.
             * @param dpdTimeoutSeconds The dead peer detection timeout of this connection in seconds
             * @return the next update stage
             */
            Update withDpdTimeoutSeconds(Integer dpdTimeoutSeconds);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection update allowing to specify EnableBgp.
         */
        interface WithEnableBgp {
            /**
             * Specifies enableBgp.
             * @param enableBgp EnableBgp flag
             * @return the next update stage
             */
            Update withEnableBgp(Boolean enableBgp);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection update allowing to specify ExpressRouteGatewayBypass.
         */
        interface WithExpressRouteGatewayBypass {
            /**
             * Specifies expressRouteGatewayBypass.
             * @param expressRouteGatewayBypass Bypass ExpressRoute Gateway for data forwarding
             * @return the next update stage
             */
            Update withExpressRouteGatewayBypass(Boolean expressRouteGatewayBypass);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection update allowing to specify IpsecPolicies.
         */
        interface WithIpsecPolicies {
            /**
             * Specifies ipsecPolicies.
             * @param ipsecPolicies The IPSec Policies to be considered by this connection
             * @return the next update stage
             */
            Update withIpsecPolicies(List<IpsecPolicy> ipsecPolicies);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection update allowing to specify LocalNetworkGateway2.
         */
        interface WithLocalNetworkGateway2 {
            /**
             * Specifies localNetworkGateway2.
             * @param localNetworkGateway2 The reference to local network gateway resource
             * @return the next update stage
             */
            Update withLocalNetworkGateway2(LocalNetworkGatewayInner localNetworkGateway2);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection update allowing to specify Peer.
         */
        interface WithPeer {
            /**
             * Specifies peer.
             * @param peer The reference to peerings resource
             * @return the next update stage
             */
            Update withPeer(SubResource peer);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection update allowing to specify RoutingWeight.
         */
        interface WithRoutingWeight {
            /**
             * Specifies routingWeight.
             * @param routingWeight The routing weight
             * @return the next update stage
             */
            Update withRoutingWeight(Integer routingWeight);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection update allowing to specify SharedKey.
         */
        interface WithSharedKey {
            /**
             * Specifies sharedKey.
             * @param sharedKey The IPSec shared key
             * @return the next update stage
             */
            Update withSharedKey(String sharedKey);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection update allowing to specify TrafficSelectorPolicies.
         */
        interface WithTrafficSelectorPolicies {
            /**
             * Specifies trafficSelectorPolicies.
             * @param trafficSelectorPolicies The Traffic Selector Policies to be considered by this connection
             * @return the next update stage
             */
            Update withTrafficSelectorPolicies(List<TrafficSelectorPolicy> trafficSelectorPolicies);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection update allowing to specify UseLocalAzureIpAddress.
         */
        interface WithUseLocalAzureIpAddress {
            /**
             * Specifies useLocalAzureIpAddress.
             * @param useLocalAzureIpAddress Use private local Azure IP for the connection
             * @return the next update stage
             */
            Update withUseLocalAzureIpAddress(Boolean useLocalAzureIpAddress);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection update allowing to specify UsePolicyBasedTrafficSelectors.
         */
        interface WithUsePolicyBasedTrafficSelectors {
            /**
             * Specifies usePolicyBasedTrafficSelectors.
             * @param usePolicyBasedTrafficSelectors Enable policy-based traffic selectors
             * @return the next update stage
             */
            Update withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors);
        }

        /**
         * The stage of the virtualnetworkgatewayconnection update allowing to specify VirtualNetworkGateway2.
         */
        interface WithVirtualNetworkGateway2 {
            /**
             * Specifies virtualNetworkGateway2.
             * @param virtualNetworkGateway2 The reference to virtual network gateway resource
             * @return the next update stage
             */
            Update withVirtualNetworkGateway2(VirtualNetworkGatewayInner virtualNetworkGateway2);
        }

    }
}
