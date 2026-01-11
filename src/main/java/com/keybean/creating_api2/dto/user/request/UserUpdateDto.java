package com.keybean.creating_api2.dto.user.request;

import jakarta.persistence.PreUpdate;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class UserUpdateDto {

    @NotNull(message = "Role id is required.")
    private Long roleId;

    @NotBlank(message = "Username is required")
    @Size(min = 5, max = 20, message = "Password must contain 5 to 20 characters")
    private String username;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @Email(message = "You must put a valid email format. Ex. sample01@gmail.com")
    private String email;

    private LocalDateTime updated;

    @PreUpdate
    protected void onUpdate () {
        updated = LocalDateTime.now();
    }

    public UserUpdateDto () {}

    public UserUpdateDto(Long roleId, String username, String firstName, String lastName, String email, LocalDateTime updated) {
        this.roleId = roleId;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.updated = updated;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
