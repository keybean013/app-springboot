package com.keybean.creating_api2.dto.role.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RoleCreateDto {

    @NotNull(message = "Role name is required")
    @Size(min = 7, max = 50, message = "Role name must contain 7 to 50 characters")
    private String roleName;

    public RoleCreateDto() {}

    public RoleCreateDto(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
