package com.keybean.creating_api2.dto.user.response;

import com.keybean.creating_api2.entity.Role;

public class UserResponseInfoDto {

    private Long id;
    private Role role;
    private String username;
    private String firstName;
    private String lastName;
    private String contactNo;
    private String address;
    private String email;

    public UserResponseInfoDto () {}

    public UserResponseInfoDto(Long id, Role role, String username, String firstName, String lastName, String contactNo, String address, String email) {
        this.id = id;
        this.role = role;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
        this.address = address;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public Role getRole() {
        return role;
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

    public String getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
