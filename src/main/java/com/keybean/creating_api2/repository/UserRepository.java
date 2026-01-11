package com.keybean.creating_api2.repository;

import com.keybean.creating_api2.dto.user.response.UserResponseDto;
import com.keybean.creating_api2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("""
        SELECT new com.keybean.creating_api2.dto.user.response.UserResponseDto(
            u.id,
            r.id,
            u.username,
            u.firstName,
            u.lastName,
            u.email,
            u.created,
            u.updated,
            u.sessionKey,
            u.isActive
        )
        
        FROM User u
        JOIN u.role r
    """)
    List<UserResponseDto> findAllUsers();

    @Query("""
        SELECT new com.keybean.creating_api2.dto.user.response.UserResponseDto(
            u.id,
            r.id,
            u.username,
            u.firstName,
            u.lastName,
            u.email,
            u.created,
            u.updated,
            u.sessionKey,
            u.isActive
        )
        FROM User u
        JOIN u.role r
        WHERE u.id = :id
    """)
    Optional<UserResponseDto> findUserById(@PathVariable Long id);

}
