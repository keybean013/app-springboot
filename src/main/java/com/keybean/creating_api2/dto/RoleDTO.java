package com.keybean.creating_api2.dto;

public class RoleDTO {

    private Long id;

    private String roleName;

    private String roleStatus;

    private String roleCreated;

    private String roleUpdated;

    public RoleDTO() {
    }

    public RoleDTO(Long id, String roleName, String roleStatus, String roleCreated, String roleUpdated) {
        this.id = id;
        this.roleName = roleName;
        this.roleStatus = roleStatus;
        this.roleCreated = roleCreated;
        this.roleUpdated = roleUpdated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
    }

    public String getRoleCreated() {
        return roleCreated;
    }

    public void setRoleCreated(String roleCreated) {
        this.roleCreated = roleCreated;
    }

    public String getRoleUpdated() {
        return roleUpdated;
    }

    public void setRoleUpdated(String roleUpdated) {
        this.roleUpdated = roleUpdated;
    }
}