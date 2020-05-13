// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/** Exception thrown for an invalid response with DefaultErrorResponse information. */
public final class DefaultErrorResponseException extends HttpResponseException {
    /**
     * Initializes a new instance of the DefaultErrorResponseException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public DefaultErrorResponseException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the DefaultErrorResponseException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public DefaultErrorResponseException(String message, HttpResponse response, DefaultErrorResponse value) {
        super(message, response, value);
    }

    @Override
    public DefaultErrorResponse getValue() {
        return (DefaultErrorResponse) super.getValue();
    }
}
