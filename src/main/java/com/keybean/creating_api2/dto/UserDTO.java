package com.keybean.creating_api2.dto;

public class UserDTO {

  private Long userId;
  private String userName;
  private String userFirstName;
  private String userLastName;
  private String userSessionKey;
  private RoleDTO userRole;

  public UserDTO(){}

  public UserDTO(Long userId, String userName, String userFirstName, String userLastName, String userSessionKey, RoleDTO userRole) {
    this.userId = userId;
    this.userName = userName;
    this.userFirstName = userFirstName;
    this.userLastName = userLastName;
    this.userSessionKey = userSessionKey;
    this.userRole = userRole;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserFirstName() {
    return userFirstName;
  }

  public void setUserFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
  }

  public String getUserLastName() {
    return userLastName;
  }

  public void setUserLastName(String userLastName) {
    this.userLastName = userLastName;
  }

  public String getUserSessionKey() {
    return userSessionKey;
  }

  public void setUserSessionKey(String userSessionKey) {
    this.userSessionKey = userSessionKey;
  }

  public RoleDTO getUserRole() {
    return userRole;
  }

  public void setUserRole(RoleDTO userRole) {
    this.userRole = userRole;
  }
}
