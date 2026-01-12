package com.keybean.creating_api2.dto.user.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserUpdatePasswordDto {

    @NotBlank(message = "Password is requried.")
    @Size(min = 5, max = 30, message = "Password must contain between 5 to 30 characters.")
    private String password;

    public UserUpdatePasswordDto () {}

    public UserUpdatePasswordDto(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
