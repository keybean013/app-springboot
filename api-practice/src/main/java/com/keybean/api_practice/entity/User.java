package com.keybean.api_practice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "session_key")
    private String sessionKey;

    public User () {}

    public User (String username, String password, boolean isActive, String sessionKey) {
        this.username = username;
        this.password = password;
        this.isActive = isActive;
        this.sessionKey = sessionKey;
    }

    public Long getId () {
        return id;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public String getSessionKey () {
        return sessionKey;
    }

    public void setSessionKey (String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public void setActive (boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsActive () {
        return isActive;
    }

}
