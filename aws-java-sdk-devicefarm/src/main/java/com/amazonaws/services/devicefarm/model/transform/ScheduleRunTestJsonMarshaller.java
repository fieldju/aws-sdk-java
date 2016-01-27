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

package com.amazonaws.services.devicefarm.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ScheduleRunTestMarshaller
 */
public class ScheduleRunTestJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ScheduleRunTest scheduleRunTest, JSONWriter jsonWriter) {
        if (scheduleRunTest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (scheduleRunTest.getType() != null) {
                jsonWriter.key("type").value(scheduleRunTest.getType());
            }

            if (scheduleRunTest.getTestPackageArn() != null) {
                jsonWriter.key("testPackageArn").value(
                        scheduleRunTest.getTestPackageArn());
            }

            if (scheduleRunTest.getFilter() != null) {
                jsonWriter.key("filter").value(scheduleRunTest.getFilter());
            }

            java.util.Map<String, String> parametersMap = scheduleRunTest
                    .getParameters();
            if (parametersMap != null) {
                jsonWriter.key("parameters");
                jsonWriter.object();

                for (Map.Entry<String, String> parametersMapValue : parametersMap
                        .entrySet()) {
                    if (parametersMapValue.getValue() != null) {
                        jsonWriter.key(parametersMapValue.getKey());

                        jsonWriter.value(parametersMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ScheduleRunTestJsonMarshaller instance;

    public static ScheduleRunTestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleRunTestJsonMarshaller();
        return instance;
    }

}
