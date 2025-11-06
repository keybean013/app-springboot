package com.keybean.creating_api2.dto;

public class UserDTO {

  private Long id;
  private String username;
  private String first_name;
  private String last_name;
  private String session_key;
  private RoleDTO role;

  public UserDTO() {}

  public UserDTO(Long id, String username, String first_name, String last_name, String session_key, RoleDTO role) {
    this.id = id;
    this.username = username;
    this.first_name = first_name;
    this.last_name = last_name;
    this.session_key = session_key;
    this.role = role;
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

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public String getSession_key() {
    return session_key;
  }

  public void setSession_key(String session_key) {
    this.session_key = session_key;
  }

  public RoleDTO getRole() {
    return role;
  }

  public void setRole(RoleDTO role) {
    this.role = role;
  }
}
