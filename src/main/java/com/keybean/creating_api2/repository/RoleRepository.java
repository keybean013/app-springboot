package com.keybean.creating_api2.repository;

import com.keybean.creating_api2.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Long>, JpaSpecificationExecutor<Role> {

    @Query(value = "SELECT * FROM role WHERE id = ?1", nativeQuery = true)
    Role getRoleById(Long id);
}
