package com.keybean.creating_api2.dto.user;

public class UserUpdateDto {

    private Long roleId;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isActive; // MUST be wrapper

    public UserUpdateDto() {}

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
