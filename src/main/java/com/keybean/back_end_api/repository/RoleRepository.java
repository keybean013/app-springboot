package com.keybean.back_end_api.repository;

import com.keybean.back_end_api.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    List<Role> findAllByDeletedAtIsNull();

    Optional<Role>  findByIdAndDeletedAtIsNull(Long id);

    Optional<Role> findByRoleNameAndDeletedAtIsNull(String roleName);

    boolean existsByRoleNameAndDeletedAtIsNull(String roleName);



}
