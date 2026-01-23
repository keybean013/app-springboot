package com.keybean.creating_api2.dto.role.response;

public class RoleAuthDto {
    private Long id;
    private String roleName;
    private String status;

    public RoleAuthDto () {}

    public RoleAuthDto(Long id, String roleName, String status) {
        this.id = id;
        this.roleName = roleName;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
