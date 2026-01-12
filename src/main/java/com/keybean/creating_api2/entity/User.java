package com.keybean.creating_api2.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_Id")
    private Role role;

    @Column(name = "username", unique = true, length = 20, nullable = false)
    private String username;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "created", updatable = false)
    private LocalDateTime created;

    @Column(name = "updated")
    private LocalDateTime updated;

    @Column(name = "session_key")
    private String sessionKey;

    @Column(name = "is_active", nullable = false)
    private boolean isActive = false;

    @PrePersist
    protected void onCreate () {
        created = LocalDateTime.now();
        updated = created;
    }

    @PreUpdate
    protected void onUpdate () {
        updated = LocalDateTime.now();
    }

    public User () {}

    public User(Long id, Role role, String username, String password, String firstName, String lastName, String email,
                LocalDateTime created, LocalDateTime updated, String sessionKey, boolean isActive) {
        this.id = id;
        this.role = role;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.created = created;
        this.updated = updated;
        this.sessionKey = sessionKey;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
