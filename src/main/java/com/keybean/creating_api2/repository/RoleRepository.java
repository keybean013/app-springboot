package com.keybean.creating_api2.repository;

import com.keybean.creating_api2.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long>,
        JpaSpecificationExecutor<Role> {

  @Query(
      value = "select \n" +
          "r.id as id,\n" +
          "r.role_name as role_name,\n" +
          "r.status as status,\n" +
          "r.created as created,\n" +
          "r.updated as updated\n" +
          "from `role` r;",
      nativeQuery = true
  )
  List<Role> getAllRoles();

  @Query(value = "SELECT * FROM role WHERE id = ?1", nativeQuery = true)
  Role getRoleById(Long id);


}
