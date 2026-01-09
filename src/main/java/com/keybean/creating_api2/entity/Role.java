package com.keybean.creating_api2.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_name", nullable = false, unique = true, length = 50)
    private String roleName;

    @Column(name = "status", nullable = false)
    private String status = "valid";

    @Column(name = "updated", nullable = false, updatable = true)
    private LocalDateTime updated;

    @Column(name = "created", nullable = false)
    private LocalDateTime created;

    @PrePersist
    protected void onCreate() {
        created = LocalDateTime.now();
        updated = created;
    }

    protected void onUpdated () {
        updated = LocalDateTime.now();
    }

    public Role () {}

    public Role(Long id, String roleName, String status, LocalDateTime updated, LocalDateTime created) {
        this.id = id;
        this.roleName = roleName;
        this.status = status;
        this.updated = updated;
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}




//
//@Entity
//@Table(name = "role")
//public class Role {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "role_name")
//    private String roleName;
//
//    @Column(name = "created")
//    private String created;
//
//    @Column(name = "status")
//    private String status;
//
//    @Column(name = "updated")
//    private String updated;
//
//    public Role () {}
//
//    public Role(Long id, String roleName, String created, String status, String updated) {
//        this.id = id;
//        this.roleName = roleName;
//        this.created = created;
//        this.status = status;
//        this.updated = updated;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getRoleName() {
//        return roleName;
//    }
//
//    public void setRoleName(String roleName) {
//        this.roleName = roleName;
//    }
//
//    public String getCreated() {
//        return created;
//    }
//
//    public void setCreated(String created) {
//        this.created = created;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getUpdated() {
//        return updated;
//    }
//
//    public void setUpdated(String updated) {
//        this.updated = updated;
//    }
//}


