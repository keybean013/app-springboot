package com.keybean.creating_api2.dto.user.request;

import com.keybean.creating_api2.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class UserCreatedDto {

    @NotNull(message = "Role id is required.")
    private Long roleId;

    @NotBlank(message = "Username is requried.")
    @Size(min = 5, max = 30, message = "Username must contain between 5 to 30 characters.")
    private String username;

    @NotBlank(message = "Password is requried.")
    @Size(min = 5, max = 30, message = "Password must contain between 5 to 30 characters.")
    private String password;

    @NotBlank(message = "Fist name is requried.")
    private String firstName;

    @NotBlank(message = "Last name is requried.")
    private String lastName;

    @NotBlank(message = "Contact is requried.")
    @Size(min = 11, max = 15, message = "Contact no must contain between 11 to 15 characters.")
    private String contactNo;

    @NotBlank(message = "address is required")
    private String address;

    @Email(message = "Email must contain a valid format. Ex. sample01@gmail.com.")
    @NotBlank(message = "Email is required.")
    private String email;

    public UserCreatedDto () {}

    public UserCreatedDto(Long roleId, String username, String password, String firstName, String lastName, String contactNo, String address, String email) {
        this.roleId = roleId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
        this.address = address;
        this.email = email;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
