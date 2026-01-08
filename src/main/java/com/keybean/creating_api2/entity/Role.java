package com.keybean.creating_api2.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "updated")
    private LocalDateTime updated;

    @Column(name = "status")
    private String status;

    public Role(LocalDateTime updated, Long id, String roleName, LocalDateTime created, String status) {
        this.updated = updated;
        this.id = id;
        this.roleName = roleName;
        this.created = created;
        this.status = status;
    }

    public Role() {

    }

    @PrePersist
    void onCreate() {
        this.created = LocalDateTime.now();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                ", status='" + status + '\'' +
                '}';
    }
}
