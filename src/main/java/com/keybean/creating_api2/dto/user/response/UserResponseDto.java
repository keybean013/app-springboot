package com.keybean.creating_api2.dto.user.response;

import java.time.LocalDateTime;

public class UserResponseDto {

    private Long id;
    private Long roleId;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime updated;
    private LocalDateTime created;
    private String sessionKey;
    private Boolean isActive;

    public UserResponseDto () {}

    public UserResponseDto(Long id, Long roleId, String username, String firstName, String lastName, String email,
                           LocalDateTime updated, LocalDateTime created, String sessionKey, Boolean isActive) {
        this.id = id;
        this.roleId = roleId;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.updated = updated;
        this.created = created;
        this.sessionKey = sessionKey;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public Boolean getActive() {
        return isActive;
    }
}
