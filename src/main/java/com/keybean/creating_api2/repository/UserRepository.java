package com.keybean.creating_api2.repository;

import com.keybean.creating_api2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>,
        JpaSpecificationExecutor<User> {

  @Query(value = "SELECT * FROM user WHERE id = ?1", nativeQuery = true)
  User getUserById(Long id);

  @Query(
      value = "select \n" +
          "u.id as id, \n" +
          "u.username as username,\n" +
          "u.first_name as first_name,\n" +
          "u.last_name  as last_name,\n" +
          "u.role_id as role_id, \n" +
          "u.session_key as session_key,\n" +
          "r.role_name as role_name \n" +
          "from `user` u JOIN role r \n" +
          "ON u.role_id = r.id;",
      nativeQuery = true
  )
  List<User> findAllUsersWithRolesRaw();


}
