package com.keybean.creating_api2.repository;

import com.keybean.creating_api2.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long>,
    JpaSpecificationExecutor<Role> {

  @Query(value="SELECT * FROM role WHERE id = ?1", nativeQuery = true)
  Role getRoleById(Long id);

  @Query(value="SELECT\n" +
      "r.id AS id,\n" +
      "r.role_name AS role_name,\n" +
      "r.status AS status,\n" +
      "r.created AS created,\n" +
      "r.updated AS updated\n" +
      "FROM `role` r;", nativeQuery = true)
  List<Role> getAllRoles();

}
