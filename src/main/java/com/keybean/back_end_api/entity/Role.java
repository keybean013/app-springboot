package com.keybean.back_end_api.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "roles")
@SQLDelete(sql = "UPDATE roles SET deleted_at = CURRENT_TIMESTAMP WHERE id =?")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "public_id", unique = true, updatable = false, length = 36, nullable = false)
    private String publicId;

    @Column(name = "role_name", unique = true, nullable = false)
    private String roleName;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status = Status.INACTIVE;

    @CreatedDate
    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private List<User> users;

    public enum Status {
        VALID, INVALID, INACTIVE
    }

    public void softDelete () {
        this.deletedAt = LocalDateTime.now();
        this.status = Status.INVALID;
    }

    @PrePersist
    public void generatePublicId () {
        if (publicId == null) {
            this.publicId = UUID.randomUUID().toString();
        }
    }

}
