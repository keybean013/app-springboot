package com.keybean.creating_api2.dto.user;


public class UserResponseDto {

    private Long id;
    private Long roleId;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isActive;
    private String sessionKey;

    public UserResponseDto () {}

    public UserResponseDto(Long id, Long roleId, String username, String firstName, String lastName, String email, Boolean isActive, String sessionKey) {
        this.id = id;
        this.roleId = roleId;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isActive = isActive;
        this.sessionKey = sessionKey;
    }

    public Long getId() {
        return id;
    }

    public Long getRoleId() {
        return roleId;
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

    public Boolean getActive() {
        return isActive;
    }

    public String getSessionKey() {
        return sessionKey;
    }
}


//public class UserResponseDto {
//
//    private Long id;
//    private Long roleId;
//    private String username;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private Boolean isActive;
//    private String sessionKey;
//
//    public UserResponseDto(Long id, Long roleId, String username, String firstName, String lastName, String email, Boolean isActive, String sessionKey) {
//        this.id = id;
//        this.roleId = roleId;
//        this.username = username;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.isActive = isActive;
//        this.sessionKey = sessionKey;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public Long getRoleId() {
//        return roleId;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public Boolean isActive() {
//        return isActive;
//    }
//
//    public String getSessionKey() {
//        return sessionKey;
//    }
//}
