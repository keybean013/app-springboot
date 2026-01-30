package com.example.api.repository;

import com.example.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUsernameAndDeletedAtIsNull (String username);

    boolean existsByEmailAndDeletedAtIsNull (String email);

    Optional<User> findByIdAndDeletedAtIsNull (Long id);

    List<User> findAllByDeletedAtIsNull();

}
