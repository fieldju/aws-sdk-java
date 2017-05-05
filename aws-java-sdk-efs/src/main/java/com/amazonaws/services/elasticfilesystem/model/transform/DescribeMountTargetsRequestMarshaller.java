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
package com.amazonaws.services.elasticfilesystem.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticfilesystem.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeMountTargetsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeMountTargetsRequestMarshaller {

    private static final MarshallingInfo<Integer> MAXITEMS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("MaxItems").build();
    private static final MarshallingInfo<String> MARKER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("Marker").build();
    private static final MarshallingInfo<String> FILESYSTEMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("FileSystemId").build();
    private static final MarshallingInfo<String> MOUNTTARGETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("MountTargetId").build();

    private static final DescribeMountTargetsRequestMarshaller instance = new DescribeMountTargetsRequestMarshaller();

    public static DescribeMountTargetsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeMountTargetsRequest describeMountTargetsRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeMountTargetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeMountTargetsRequest.getMaxItems(), MAXITEMS_BINDING);
            protocolMarshaller.marshall(describeMountTargetsRequest.getMarker(), MARKER_BINDING);
            protocolMarshaller.marshall(describeMountTargetsRequest.getFileSystemId(), FILESYSTEMID_BINDING);
            protocolMarshaller.marshall(describeMountTargetsRequest.getMountTargetId(), MOUNTTARGETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
