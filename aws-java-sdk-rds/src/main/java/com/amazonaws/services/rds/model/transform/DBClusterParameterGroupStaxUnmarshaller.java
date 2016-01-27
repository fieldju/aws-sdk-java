/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rds.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * D B Cluster Parameter Group StAX Unmarshaller
 */
public class DBClusterParameterGroupStaxUnmarshaller implements Unmarshaller<DBClusterParameterGroup, StaxUnmarshallerContext> {

    public DBClusterParameterGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBClusterParameterGroup dBClusterParameterGroup = new DBClusterParameterGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 2;

        if (context.isStartOfDocument()) targetDepth++;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return dBClusterParameterGroup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("DBClusterParameterGroupName", targetDepth)) {
                    dBClusterParameterGroup.setDBClusterParameterGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBParameterGroupFamily", targetDepth)) {
                    dBClusterParameterGroup.setDBParameterGroupFamily(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    dBClusterParameterGroup.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBClusterParameterGroup;
                }
            }
        }
    }

    private static DBClusterParameterGroupStaxUnmarshaller instance;
    public static DBClusterParameterGroupStaxUnmarshaller getInstance() {
        if (instance == null) instance = new DBClusterParameterGroupStaxUnmarshaller();
        return instance;
    }
}
    