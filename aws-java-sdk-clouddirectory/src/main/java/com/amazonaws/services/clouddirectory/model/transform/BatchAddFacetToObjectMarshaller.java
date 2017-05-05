/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchAddFacetToObjectMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchAddFacetToObjectMarshaller {

    private static final MarshallingInfo<StructuredPojo> SCHEMAFACET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SchemaFacet").build();
    private static final MarshallingInfo<List> OBJECTATTRIBUTELIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectAttributeList").build();
    private static final MarshallingInfo<StructuredPojo> OBJECTREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectReference").build();

    private static final BatchAddFacetToObjectMarshaller instance = new BatchAddFacetToObjectMarshaller();

    public static BatchAddFacetToObjectMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchAddFacetToObject batchAddFacetToObject, ProtocolMarshaller protocolMarshaller) {

        if (batchAddFacetToObject == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchAddFacetToObject.getSchemaFacet(), SCHEMAFACET_BINDING);
            protocolMarshaller.marshall(batchAddFacetToObject.getObjectAttributeList(), OBJECTATTRIBUTELIST_BINDING);
            protocolMarshaller.marshall(batchAddFacetToObject.getObjectReference(), OBJECTREFERENCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
