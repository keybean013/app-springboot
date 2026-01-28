package com.keybean.creating_api2.repository;

import com.keybean.creating_api2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByIdAndIsActiveIsTrue(Long id);
    List<User> findAllUserByIsActiveIsTrue();

    Optional<User> findByIdAndDeletedAtIsNull(Long id);

}
