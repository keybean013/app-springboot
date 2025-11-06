package com.keybean.creating_api2.dto;

public class RoleDTO {

  private Long id;
  private String roleName;
  private String status;
  private String created;
  private String updated;

  public RoleDTO(){}

  public RoleDTO(Long id, String roleName, String status, String created, String updated) {
    this.id = id;
    this.roleName = roleName;
    this.status = status;
    this.created = created;
    this.updated = updated;
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

  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }
}
