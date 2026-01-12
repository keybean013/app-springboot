package com.keybean.creating_api2.dto.user.request;

import jakarta.persistence.PreUpdate;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class UserUpdateDto {

    private Long roleId;
    private String firstName;
    private String lastName;

    @Email(message = "You must out an invalid email format. Ex. sample01@Gmail.com")
    private String email;

    public UserUpdateDto() {
    }

    public UserUpdateDto(Long roleId, String firstName, String lastName, String email) {
        this.roleId = roleId;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
