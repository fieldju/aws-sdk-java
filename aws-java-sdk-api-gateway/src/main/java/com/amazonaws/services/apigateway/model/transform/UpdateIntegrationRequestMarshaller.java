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
package com.amazonaws.services.apigateway.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateIntegrationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateIntegrationRequestMarshaller {

    private static final MarshallingInfo<String> RESTAPIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("restapi_id").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("resource_id").build();
    private static final MarshallingInfo<String> HTTPMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("http_method").build();
    private static final MarshallingInfo<List> PATCHOPERATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("patchOperations").build();

    private static final UpdateIntegrationRequestMarshaller instance = new UpdateIntegrationRequestMarshaller();

    public static UpdateIntegrationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateIntegrationRequest updateIntegrationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateIntegrationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateIntegrationRequest.getRestApiId(), RESTAPIID_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getHttpMethod(), HTTPMETHOD_BINDING);
            protocolMarshaller.marshall(updateIntegrationRequest.getPatchOperations(), PATCHOPERATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
