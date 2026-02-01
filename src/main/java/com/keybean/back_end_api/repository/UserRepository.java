package com.keybean.back_end_api.repository;

import com.keybean.back_end_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByIdAndDeletedAtIsNull(Long id);

    List<User> findAllByDeletedAtIsNull();

}
