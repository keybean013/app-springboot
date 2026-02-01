package com.keybean.back_end_api.repository;

import com.keybean.back_end_api.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByRoleNameAndDeletedAtIsNull (String roleName);

    Optional<Role> findByIdAndDeletedAtIsNull (Long id);

    List<Role> findAllByDeletedAtIsNull ();

    boolean existsByRoleNameAndDeletedAtIsNull(String roleName);

    boolean existsByRoleNameAndDeletedAtIsNullAndIdNot(String roleName, Long id);

}
