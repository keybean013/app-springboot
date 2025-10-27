package com.upd.amazon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "username", unique = true)
  private String username;

  @Column(name = "password")
  private String password;

  @Column(name = "is_active")
  private boolean isActive;

  @Column(name = "session_key")
  private String sessionKey;

  public User() {
  }

  public User(String username, String password, boolean isActive,
              String sessionKey) {
    this.username = username;
    this.password = password;
    this.sessionKey = sessionKey;
    this.isActive = isActive;

  }

  public Long getId() {
    return id;
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

  public String getSessionKey() {
    return sessionKey;
  }

  public void setSessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
  }

  public void setisActive(boolean isActive) {
    this.isActive = isActive;
  }

  public boolean getisActive() {
    return isActive;
  }

}