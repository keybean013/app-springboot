package com.keybean.creating_api2.dto.user.request;

import jakarta.persistence.PrePersist;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class UserCreateDto {

    @NotNull(message = "Role id is required.")
    private Long roleId;

    @NotBlank(message = "Username is required")
    @Size(min = 5, max = 20, message = "Username must contain 5 to 20 characters")
    private String username;

    @NotBlank(message = "Password is required")
    @Size(min = 5, max = 20, message = "Password must contain 5 to 20 characters")
    private String password;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @Email(message = "You must put a valid email format. Ex. sample01@gmail.com")
    @NotBlank(message = "Email is required")
    private String email;

    private LocalDateTime created;
    private LocalDateTime updated;
    private Boolean isActive = false;

    @PrePersist
    protected void onCreate () {
        created = LocalDateTime.now();
        updated = created;
    }

    public UserCreateDto () {}

    public UserCreateDto(Long roleId, String username, String password, String firstName, String lastName,
                         String email, LocalDateTime created, LocalDateTime updated, Boolean isActive) {
        this.roleId = roleId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.created = created;
        this.updated = updated;
        this.isActive = isActive;
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

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
