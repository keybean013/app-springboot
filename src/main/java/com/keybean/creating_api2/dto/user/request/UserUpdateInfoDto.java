package com.keybean.creating_api2.dto.user.request;

import jakarta.validation.constraints.NotBlank;

public class UserUpdateInfoDto {

    private Long roleId;

    private String firstName;

    private String lastName;

    private String contactNo;

    private String address;

    private String email;

    public UserUpdateInfoDto() {}

    public UserUpdateInfoDto(Long roleId, String firstName, String lastName, String contactNo, String address, String email) {
        this.roleId = roleId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
        this.address = address;
        this.email = email;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
