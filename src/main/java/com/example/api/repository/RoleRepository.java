package com.example.api.repository;

import com.example.api.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    boolean existsByRoleNameAndDeletedAtIsNull (String roleName);

    Optional<Role> findByIdAndDeletedAtIsNull (Long id);

    List<Role> findAllByDeletedAtIsNull ();



}
