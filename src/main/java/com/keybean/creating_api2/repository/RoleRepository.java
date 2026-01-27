package com.keybean.creating_api2.repository;

import com.keybean.creating_api2.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {


    Optional<Role> findByIdAndDeletedAtIsNull (Long id);
    List<Role> findAllByDeletedAtIsNull();
    List<Role> findByRoleNameAndDeletedAtIsNull(String roleName);



}
