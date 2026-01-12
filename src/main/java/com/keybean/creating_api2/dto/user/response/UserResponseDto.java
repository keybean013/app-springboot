package com.keybean.creating_api2.dto.user.response;

import com.keybean.creating_api2.entity.Role;

import java.time.LocalDateTime;

public class UserResponseDto {

    private Long id;
    private Role role;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime created;
    private LocalDateTime updated;
    private String sessionKey;
    private Boolean isActive;

    public UserResponseDto () {}

    public UserResponseDto(Long id, Role role, String username, String firstName, String lastName,
                           String email, LocalDateTime created, LocalDateTime updated, String sessionKey, Boolean isActive) {
        this.id = id;
        this.role = role;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.created = created;
        this.updated = updated;
        this.sessionKey = sessionKey;
        this.isActive = isActive;
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public Boolean getActive() {
        return isActive;
    }
}
