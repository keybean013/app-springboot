package com.keybean.creating_api2.dto.auth.response;

import com.keybean.creating_api2.dto.role.response.RoleAuthDto;

public class AuthResponseDto {

    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String sessionKey;
    private RoleAuthDto roleInfo;

    public AuthResponseDto() {
    }

    public AuthResponseDto(Long id, String username, String firstName, String lastName, String sessionKey, RoleAuthDto roleInfo) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sessionKey = sessionKey;
        this.roleInfo = roleInfo;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public RoleAuthDto getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(RoleAuthDto roleInfo) {
        this.roleInfo = roleInfo;
    }
}
