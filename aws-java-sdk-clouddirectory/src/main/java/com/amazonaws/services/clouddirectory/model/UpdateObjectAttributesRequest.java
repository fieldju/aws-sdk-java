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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UpdateObjectAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateObjectAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN associated with the <a>Directory</a> where the object resides. For more information, see <a>arns</a>.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * Reference that identifies the object.
     * </p>
     */
    private ObjectReference objectReference;
    /**
     * <p>
     * Attributes update structure.
     * </p>
     */
    private java.util.List<ObjectAttributeUpdate> attributeUpdates;

    /**
     * <p>
     * ARN associated with the <a>Directory</a> where the object resides. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        ARN associated with the <a>Directory</a> where the object resides. For more information, see <a>arns</a>.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * ARN associated with the <a>Directory</a> where the object resides. For more information, see <a>arns</a>.
     * </p>
     * 
     * @return ARN associated with the <a>Directory</a> where the object resides. For more information, see <a>arns</a>.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * ARN associated with the <a>Directory</a> where the object resides. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        ARN associated with the <a>Directory</a> where the object resides. For more information, see <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateObjectAttributesRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * Reference that identifies the object.
     * </p>
     * 
     * @param objectReference
     *        Reference that identifies the object.
     */

    public void setObjectReference(ObjectReference objectReference) {
        this.objectReference = objectReference;
    }

    /**
     * <p>
     * Reference that identifies the object.
     * </p>
     * 
     * @return Reference that identifies the object.
     */

    public ObjectReference getObjectReference() {
        return this.objectReference;
    }

    /**
     * <p>
     * Reference that identifies the object.
     * </p>
     * 
     * @param objectReference
     *        Reference that identifies the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateObjectAttributesRequest withObjectReference(ObjectReference objectReference) {
        setObjectReference(objectReference);
        return this;
    }

    /**
     * <p>
     * Attributes update structure.
     * </p>
     * 
     * @return Attributes update structure.
     */

    public java.util.List<ObjectAttributeUpdate> getAttributeUpdates() {
        return attributeUpdates;
    }

    /**
     * <p>
     * Attributes update structure.
     * </p>
     * 
     * @param attributeUpdates
     *        Attributes update structure.
     */

    public void setAttributeUpdates(java.util.Collection<ObjectAttributeUpdate> attributeUpdates) {
        if (attributeUpdates == null) {
            this.attributeUpdates = null;
            return;
        }

        this.attributeUpdates = new java.util.ArrayList<ObjectAttributeUpdate>(attributeUpdates);
    }

    /**
     * <p>
     * Attributes update structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeUpdates(java.util.Collection)} or {@link #withAttributeUpdates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributeUpdates
     *        Attributes update structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateObjectAttributesRequest withAttributeUpdates(ObjectAttributeUpdate... attributeUpdates) {
        if (this.attributeUpdates == null) {
            setAttributeUpdates(new java.util.ArrayList<ObjectAttributeUpdate>(attributeUpdates.length));
        }
        for (ObjectAttributeUpdate ele : attributeUpdates) {
            this.attributeUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Attributes update structure.
     * </p>
     * 
     * @param attributeUpdates
     *        Attributes update structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateObjectAttributesRequest withAttributeUpdates(java.util.Collection<ObjectAttributeUpdate> attributeUpdates) {
        setAttributeUpdates(attributeUpdates);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
        if (getObjectReference() != null)
            sb.append("ObjectReference: ").append(getObjectReference()).append(",");
        if (getAttributeUpdates() != null)
            sb.append("AttributeUpdates: ").append(getAttributeUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateObjectAttributesRequest == false)
            return false;
        UpdateObjectAttributesRequest other = (UpdateObjectAttributesRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getObjectReference() == null ^ this.getObjectReference() == null)
            return false;
        if (other.getObjectReference() != null && other.getObjectReference().equals(this.getObjectReference()) == false)
            return false;
        if (other.getAttributeUpdates() == null ^ this.getAttributeUpdates() == null)
            return false;
        if (other.getAttributeUpdates() != null && other.getAttributeUpdates().equals(this.getAttributeUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getObjectReference() == null) ? 0 : getObjectReference().hashCode());
        hashCode = prime * hashCode + ((getAttributeUpdates() == null) ? 0 : getAttributeUpdates().hashCode());
        return hashCode;
    }

    @Override
    public UpdateObjectAttributesRequest clone() {
        return (UpdateObjectAttributesRequest) super.clone();
    }

}
