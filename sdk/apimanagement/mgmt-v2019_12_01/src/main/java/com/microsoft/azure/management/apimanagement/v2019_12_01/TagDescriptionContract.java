/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.TagDescriptionContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.ApiManagementManager;

/**
 * Type representing TagDescriptionContract.
 */
public interface TagDescriptionContract extends HasInner<TagDescriptionContractInner>, Indexable, Refreshable<TagDescriptionContract>, Updatable<TagDescriptionContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the externalDocsDescription value.
     */
    String externalDocsDescription();

    /**
     * @return the externalDocsUrl value.
     */
    String externalDocsUrl();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the tagId value.
     */
    String tagId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the TagDescriptionContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithApi, DefinitionStages.WithIfMatch, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of TagDescriptionContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a TagDescriptionContract definition.
         */
        interface Blank extends WithApi {
        }

        /**
         * The stage of the tagdescriptioncontract definition allowing to specify Api.
         */
        interface WithApi {
           /**
            * Specifies resourceGroupName, serviceName, apiId.
            * @param resourceGroupName The name of the resource group
            * @param serviceName The name of the API Management service
            * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number
            * @return the next definition stage
            */
            WithIfMatch withExistingApi(String resourceGroupName, String serviceName, String apiId);
        }

        /**
         * The stage of the tagdescriptioncontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithCreate withIfMatch(String ifMatch);
        }

        /**
         * The stage of the tagdescriptioncontract definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of the Tag
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the tagdescriptioncontract definition allowing to specify ExternalDocsDescription.
         */
        interface WithExternalDocsDescription {
            /**
             * Specifies externalDocsDescription.
             * @param externalDocsDescription Description of the external resources describing the tag
             * @return the next definition stage
             */
            WithCreate withExternalDocsDescription(String externalDocsDescription);
        }

        /**
         * The stage of the tagdescriptioncontract definition allowing to specify ExternalDocsUrl.
         */
        interface WithExternalDocsUrl {
            /**
             * Specifies externalDocsUrl.
             * @param externalDocsUrl Absolute URL of external resources describing the tag
             * @return the next definition stage
             */
            WithCreate withExternalDocsUrl(String externalDocsUrl);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<TagDescriptionContract>, DefinitionStages.WithDescription, DefinitionStages.WithExternalDocsDescription, DefinitionStages.WithExternalDocsUrl {
        }
    }
    /**
     * The template for a TagDescriptionContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<TagDescriptionContract>, UpdateStages.WithIfMatch, UpdateStages.WithDescription, UpdateStages.WithExternalDocsDescription, UpdateStages.WithExternalDocsUrl {
    }

    /**
     * Grouping of TagDescriptionContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the tagdescriptioncontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the tagdescriptioncontract update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of the Tag
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the tagdescriptioncontract update allowing to specify ExternalDocsDescription.
         */
        interface WithExternalDocsDescription {
            /**
             * Specifies externalDocsDescription.
             * @param externalDocsDescription Description of the external resources describing the tag
             * @return the next update stage
             */
            Update withExternalDocsDescription(String externalDocsDescription);
        }

        /**
         * The stage of the tagdescriptioncontract update allowing to specify ExternalDocsUrl.
         */
        interface WithExternalDocsUrl {
            /**
             * Specifies externalDocsUrl.
             * @param externalDocsUrl Absolute URL of external resources describing the tag
             * @return the next update stage
             */
            Update withExternalDocsUrl(String externalDocsUrl);
        }

    }
}
