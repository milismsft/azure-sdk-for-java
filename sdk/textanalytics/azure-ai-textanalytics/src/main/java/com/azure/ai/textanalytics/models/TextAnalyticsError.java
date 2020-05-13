// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Immutable;

/**
 * The {@link TextAnalyticsError} model.
 */
@Immutable
public final class TextAnalyticsError {
    /*
     * Error code. Possible values include: 'invalidRequest',
     * 'invalidArgument', 'internalServerError', 'serviceUnavailable'
     */
    private final TextAnalyticsErrorCode code;

    /*
     * Error message.
     */
    private final String message;

    /*
     * Error target.
     */
    private final String target;

    /**
     * Creates a {@code TextAnalyticsError} model that describes text analytics error.
     *
     * @param code The error code.
     * @param message The error message.
     * @param target The error target.
     */
    public TextAnalyticsError(TextAnalyticsErrorCode code, String message, String target) {
        this.code = code;
        this.message = message;
        this.target = target;
    }

    /**
     * Get the code property: Error code. Possible values include:
     * 'invalidRequest', 'invalidArgument', 'internalServerError',
     * 'serviceUnavailable'.
     *
     * @return The code value.
     */
    public TextAnalyticsErrorCode getErrorCode() {
        return this.code;
    }

    /**
     * Get the message property: Error message.
     *
     * @return The message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: Error target.
     *
     * @return The target value.
     */
    public String getTarget() {
        return this.target;
    }
}
