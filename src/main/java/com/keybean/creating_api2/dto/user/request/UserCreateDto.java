package com.keybean.creating_api2.dto.user.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;


public class UserCreateDto {

    @NotNull(message = "Role name is required")
    private Long roleId;

    @NotBlank(message = "Username is requried")
    @Size(min = 5, max = 30, message = "Username must contain 5 to 30 characters")
    private String username;

    @NotBlank(message = "Password is requried")
    @Size(min = 5, max = 30, message = "Password must contain 5 to 30 characters")
    private String password;

    @NotBlank(message = "First name is requried")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "You must out an invalid email format. Ex. sample01@Gmail.com")
    private String email;

    private LocalDateTime created;
    private LocalDateTime updated;

    public UserCreateDto () {}

    public UserCreateDto(Long roleId, String username, String password, String firstName, String lastName,
                         String email, LocalDateTime created, LocalDateTime updated ){
        this.roleId = roleId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.created = created;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
