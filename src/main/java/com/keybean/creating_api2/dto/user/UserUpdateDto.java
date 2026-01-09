package com.keybean.creating_api2.dto.user;


import jakarta.validation.constraints.Email;

public class UserUpdateDto {

    private String firstName;
    private String lastName;

    @Email
    private String email;
    private Long roleId;

    public UserUpdateDto () {}

    public UserUpdateDto(String firstName, String lastName, String email, Long roleId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}

//public class UserUpdateDto {
//
//    private Long roleId;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private Boolean isActive;
//
//    public UserUpdateDto () {}
//
//    public UserUpdateDto(Long roleId, String firstName, String lastName, String email, Boolean isActive) {
//        this.roleId = roleId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.isActive = isActive;
//    }
//
//    public Long getRoleId() {
//        return roleId;
//    }
//
//    public void setRoleId(Long roleId) {
//        this.roleId = roleId;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public boolean isActive() {
//        return isActive;
//    }
//
//    public void setActive(Boolean active) {
//        isActive = active;
//    }
//}
