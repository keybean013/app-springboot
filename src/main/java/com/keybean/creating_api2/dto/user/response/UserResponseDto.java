package com.keybean.creating_api2.dto.user.response;

import com.keybean.creating_api2.entity.Role;

import java.time.LocalDateTime;

public class UserResponseDto {

    private Long id;
    private Role role;
    private String username;
    private String firstName;
    private String lastName;
    private String contactNo;
    private String address;
    private String email;
    private Boolean isActive;
    private String sessionKey;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    public UserResponseDto () {}

    public UserResponseDto(Long id, Role role, String username, String firstName, String lastName, String contactNo, String address, String email, Boolean isActive, String sessionKey, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt) {
        this.id = id;
        this.role = role;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
        this.address = address;
        this.email = email;
        this.isActive = isActive;
        this.sessionKey = sessionKey;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public Long getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getActive() {
        return isActive;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }
}
