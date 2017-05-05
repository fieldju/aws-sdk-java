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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the organization.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The login name of the user.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The given name of the user.
     * </p>
     */
    private String givenName;
    /**
     * <p>
     * The surname of the user.
     * </p>
     */
    private String surname;
    /**
     * <p>
     * The password of the user.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The time zone ID of the user.
     * </p>
     */
    private String timeZoneId;
    /**
     * <p>
     * The amount of storage for the user.
     * </p>
     */
    private StorageRuleType storageRule;

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @return The ID of the organization.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The login name of the user.
     * </p>
     * 
     * @param username
     *        The login name of the user.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The login name of the user.
     * </p>
     * 
     * @return The login name of the user.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The login name of the user.
     * </p>
     * 
     * @param username
     *        The login name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The given name of the user.
     * </p>
     * 
     * @param givenName
     *        The given name of the user.
     */

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * <p>
     * The given name of the user.
     * </p>
     * 
     * @return The given name of the user.
     */

    public String getGivenName() {
        return this.givenName;
    }

    /**
     * <p>
     * The given name of the user.
     * </p>
     * 
     * @param givenName
     *        The given name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withGivenName(String givenName) {
        setGivenName(givenName);
        return this;
    }

    /**
     * <p>
     * The surname of the user.
     * </p>
     * 
     * @param surname
     *        The surname of the user.
     */

    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * <p>
     * The surname of the user.
     * </p>
     * 
     * @return The surname of the user.
     */

    public String getSurname() {
        return this.surname;
    }

    /**
     * <p>
     * The surname of the user.
     * </p>
     * 
     * @param surname
     *        The surname of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withSurname(String surname) {
        setSurname(surname);
        return this;
    }

    /**
     * <p>
     * The password of the user.
     * </p>
     * 
     * @param password
     *        The password of the user.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password of the user.
     * </p>
     * 
     * @return The password of the user.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password of the user.
     * </p>
     * 
     * @param password
     *        The password of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The time zone ID of the user.
     * </p>
     * 
     * @param timeZoneId
     *        The time zone ID of the user.
     */

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    /**
     * <p>
     * The time zone ID of the user.
     * </p>
     * 
     * @return The time zone ID of the user.
     */

    public String getTimeZoneId() {
        return this.timeZoneId;
    }

    /**
     * <p>
     * The time zone ID of the user.
     * </p>
     * 
     * @param timeZoneId
     *        The time zone ID of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withTimeZoneId(String timeZoneId) {
        setTimeZoneId(timeZoneId);
        return this;
    }

    /**
     * <p>
     * The amount of storage for the user.
     * </p>
     * 
     * @param storageRule
     *        The amount of storage for the user.
     */

    public void setStorageRule(StorageRuleType storageRule) {
        this.storageRule = storageRule;
    }

    /**
     * <p>
     * The amount of storage for the user.
     * </p>
     * 
     * @return The amount of storage for the user.
     */

    public StorageRuleType getStorageRule() {
        return this.storageRule;
    }

    /**
     * <p>
     * The amount of storage for the user.
     * </p>
     * 
     * @param storageRule
     *        The amount of storage for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withStorageRule(StorageRuleType storageRule) {
        setStorageRule(storageRule);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getGivenName() != null)
            sb.append("GivenName: ").append(getGivenName()).append(",");
        if (getSurname() != null)
            sb.append("Surname: ").append(getSurname()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword()).append(",");
        if (getTimeZoneId() != null)
            sb.append("TimeZoneId: ").append(getTimeZoneId()).append(",");
        if (getStorageRule() != null)
            sb.append("StorageRule: ").append(getStorageRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserRequest == false)
            return false;
        CreateUserRequest other = (CreateUserRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getGivenName() == null ^ this.getGivenName() == null)
            return false;
        if (other.getGivenName() != null && other.getGivenName().equals(this.getGivenName()) == false)
            return false;
        if (other.getSurname() == null ^ this.getSurname() == null)
            return false;
        if (other.getSurname() != null && other.getSurname().equals(this.getSurname()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getTimeZoneId() == null ^ this.getTimeZoneId() == null)
            return false;
        if (other.getTimeZoneId() != null && other.getTimeZoneId().equals(this.getTimeZoneId()) == false)
            return false;
        if (other.getStorageRule() == null ^ this.getStorageRule() == null)
            return false;
        if (other.getStorageRule() != null && other.getStorageRule().equals(this.getStorageRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getGivenName() == null) ? 0 : getGivenName().hashCode());
        hashCode = prime * hashCode + ((getSurname() == null) ? 0 : getSurname().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getTimeZoneId() == null) ? 0 : getTimeZoneId().hashCode());
        hashCode = prime * hashCode + ((getStorageRule() == null) ? 0 : getStorageRule().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserRequest clone() {
        return (CreateUserRequest) super.clone();
    }

}
