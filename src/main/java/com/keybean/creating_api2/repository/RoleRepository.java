package com.keybean.creating_api2.repository;


import com.keybean.creating_api2.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    // Find role by name (used in create/update user)
    Optional<Role> findRoleById(Long id);

    // Check if role exists (validation)
    boolean existsByRoleName(String roleName);
}
