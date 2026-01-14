package com.keybean.creating_api2.dto.user.request;

public class LogInRequestDto {

    private String username;
    private String password;

    public  LogInRequestDto () {}

    public LogInRequestDto(String username, String password) {
        this.username = username;
        this.password = password;
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
}
