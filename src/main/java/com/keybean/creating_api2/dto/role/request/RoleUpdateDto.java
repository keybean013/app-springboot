package com.keybean.creating_api2.dto.role.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RoleUpdateDto {

    @NotNull(message = "Role name is required")
    @Size(min = 7, max = 50, message = "Role name must contain 7 to 50 characters")
    private String roleName;

    private String status;

    public RoleUpdateDto () {}

    public RoleUpdateDto(String roleName, String status) {
        this.roleName = roleName;
        this.status = status;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
