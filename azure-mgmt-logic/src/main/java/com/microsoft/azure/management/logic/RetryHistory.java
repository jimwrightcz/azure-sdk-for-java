/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The retry history.
 */
public class RetryHistory {
    /**
     * Gets the start time.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * Gets the end time.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * Gets the status code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Gets the client request Id.
     */
    @JsonProperty(value = "clientRequestId")
    private String clientRequestId;

    /**
     * Gets the service request Id.
     */
    @JsonProperty(value = "serviceRequestId")
    private String serviceRequestId;

    /**
     * Gets the error response.
     */
    @JsonProperty(value = "error")
    private ErrorResponse error;

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the RetryHistory object itself.
     */
    public RetryHistory withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     * @return the RetryHistory object itself.
     */
    public RetryHistory withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the RetryHistory object itself.
     */
    public RetryHistory withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the clientRequestId value.
     *
     * @return the clientRequestId value
     */
    public String clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId value.
     *
     * @param clientRequestId the clientRequestId value to set
     * @return the RetryHistory object itself.
     */
    public RetryHistory withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the serviceRequestId value.
     *
     * @return the serviceRequestId value
     */
    public String serviceRequestId() {
        return this.serviceRequestId;
    }

    /**
     * Set the serviceRequestId value.
     *
     * @param serviceRequestId the serviceRequestId value to set
     * @return the RetryHistory object itself.
     */
    public RetryHistory withServiceRequestId(String serviceRequestId) {
        this.serviceRequestId = serviceRequestId;
        return this;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public ErrorResponse error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the RetryHistory object itself.
     */
    public RetryHistory withError(ErrorResponse error) {
        this.error = error;
        return this;
    }

}
