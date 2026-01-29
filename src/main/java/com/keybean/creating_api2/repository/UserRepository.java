package com.keybean.creating_api2.repository;

import com.keybean.creating_api2.entity.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUsernameAndDeletedAtIsNull (String username);

    List<User> findAllByDeletedAtIsNull ();


    boolean existsByEmailAndDeletedAtIsNull (String email);

    Optional<User> findByIdAndDeletedAtIsNull(Long id);

//    List<User> findAllUserByIsActiveIsTrue();
//
//    Optional<User> findById(Long id);

}
