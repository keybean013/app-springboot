package com.keybean.creating_api2.repository;


import com.keybean.creating_api2.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface RoleRepository extends JpaRepository<Role, Long> {

}
//
//@Repository
//public interface RoleRepository extends JpaRepository<Role, Long> {
//
//    // Find role by name (used in create/update user)
//    Optional<Role> findByRoleName(String roleName);
//
//    // Check if role exists (validation)
//    boolean existsByRoleName(String roleName);
//}
