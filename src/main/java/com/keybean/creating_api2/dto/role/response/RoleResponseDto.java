package com.keybean.creating_api2.dto.role.response;

public class RoleResponseDto {
    private Long id;
    private String roleName;

    public RoleResponseDto () {}

    public RoleResponseDto(Long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public Long getId() {
        return id;
    }

    public String getRoleName() {
        return roleName;
    }
}
