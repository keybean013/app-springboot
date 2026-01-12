package com.keybean.creating_api2.repository;

import com.keybean.creating_api2.dto.role.response.RoleResponseDto;
import com.keybean.creating_api2.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {


    @Query("""
        SELECT new com.keybean.creating_api2.dto.role.response.RoleResponseDto (
            r.id,
            r.roleName,
            r.status,
            r.createdAt,
            r.updatedAt,
            r.deletedAt
        )
        FROM Role r
        WHERE r.deletedAt IS NULL
    """)
    List<RoleResponseDto> findAllRoles();

    @Query("""
        SELECT new com.keybean.creating_api2.dto.role.response.RoleResponseDto (
            r.id,
            r.roleName,
            r.status,
            r.createdAt,
            r.updatedAt,
            r.deletedAt
        )
        FROM Role r
        WHERE r.id = :id
    """)
    Optional<RoleResponseDto> findRoleById(@Param("id") Long id);

}
