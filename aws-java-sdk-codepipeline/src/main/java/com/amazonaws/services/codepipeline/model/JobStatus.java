/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.codepipeline.model;

/**
 * 
 */
public enum JobStatus {

    Created("Created"),
    Queued("Queued"),
    Dispatched("Dispatched"),
    InProgress("InProgress"),
    TimedOut("TimedOut"),
    Succeeded("Succeeded"),
    Failed("Failed");

    private String value;

    private JobStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return JobStatus corresponding to the value
     */
    public static JobStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("Created".equals(value)) {
            return Created;
        } else if ("Queued".equals(value)) {
            return Queued;
        } else if ("Dispatched".equals(value)) {
            return Dispatched;
        } else if ("InProgress".equals(value)) {
            return InProgress;
        } else if ("TimedOut".equals(value)) {
            return TimedOut;
        } else if ("Succeeded".equals(value)) {
            return Succeeded;
        } else if ("Failed".equals(value)) {
            return Failed;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}