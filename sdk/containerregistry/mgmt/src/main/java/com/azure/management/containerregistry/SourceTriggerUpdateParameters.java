// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The SourceTriggerUpdateParameters model.
 */
@Fluent
public final class SourceTriggerUpdateParameters {
    /*
     * The properties that describes the source(code) for the task.
     */
    @JsonProperty(value = "sourceRepository")
    private SourceUpdateParameters sourceRepository;

    /*
     * The source event corresponding to the trigger.
     */
    @JsonProperty(value = "sourceTriggerEvents")
    private List<SourceTriggerEvent> sourceTriggerEvents;

    /*
     * The current status of trigger.
     */
    @JsonProperty(value = "status")
    private TriggerStatus status;

    /*
     * The name of the trigger.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the sourceRepository property: The properties that describes the
     * source(code) for the task.
     * 
     * @return the sourceRepository value.
     */
    public SourceUpdateParameters sourceRepository() {
        return this.sourceRepository;
    }

    /**
     * Set the sourceRepository property: The properties that describes the
     * source(code) for the task.
     * 
     * @param sourceRepository the sourceRepository value to set.
     * @return the SourceTriggerUpdateParameters object itself.
     */
    public SourceTriggerUpdateParameters withSourceRepository(SourceUpdateParameters sourceRepository) {
        this.sourceRepository = sourceRepository;
        return this;
    }

    /**
     * Get the sourceTriggerEvents property: The source event corresponding to
     * the trigger.
     * 
     * @return the sourceTriggerEvents value.
     */
    public List<SourceTriggerEvent> sourceTriggerEvents() {
        return this.sourceTriggerEvents;
    }

    /**
     * Set the sourceTriggerEvents property: The source event corresponding to
     * the trigger.
     * 
     * @param sourceTriggerEvents the sourceTriggerEvents value to set.
     * @return the SourceTriggerUpdateParameters object itself.
     */
    public SourceTriggerUpdateParameters withSourceTriggerEvents(List<SourceTriggerEvent> sourceTriggerEvents) {
        this.sourceTriggerEvents = sourceTriggerEvents;
        return this;
    }

    /**
     * Get the status property: The current status of trigger.
     * 
     * @return the status value.
     */
    public TriggerStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The current status of trigger.
     * 
     * @param status the status value to set.
     * @return the SourceTriggerUpdateParameters object itself.
     */
    public SourceTriggerUpdateParameters withStatus(TriggerStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the name property: The name of the trigger.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the trigger.
     * 
     * @param name the name value to set.
     * @return the SourceTriggerUpdateParameters object itself.
     */
    public SourceTriggerUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }
}