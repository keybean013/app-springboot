package com.keybean.creating_api2.repository;

import com.keybean.creating_api2.dto.user.response.UserResponseDto;
import com.keybean.creating_api2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


    @Query("""
        SELECT new com.keybean.creating_api2.dto.user.response.UserResponseDto(
            u.id,
            r,
            u.username,
            u.firstName,
            u.lastName,
            u.contactNo,
            u.address,
            u.email,
            u.isActive,
            u.sessionKey,
            u.createdAt,
            u.updatedAt,
            u.deletedAt
        )
        FROM User u
        JOIN u.role r
    """)
    List<UserResponseDto> findAllUsers();
    @Query("""
        SELECT new com.keybean.creating_api2.dto.user.response.UserResponseDto(
            u.id,
            r,
            u.username,
            u.firstName,
            u.lastName,
            u.contactNo,
            u.address,
            u.email,
            u.isActive,
            u.sessionKey,
            u.createdAt,
            u.updatedAt,
            u.deletedAt
        )
        FROM User u
        JOIN u.role r
        WHERE u.id = :id
    """)
    Optional<UserResponseDto> findUserById(@Param("id") Long id);

    @Query("""
        SELECT u FROM User u
        JOIN FETCH u.role
        WHERE u.username = :username
    """)
    Optional<User> findByUsernameWithRoles(@Param("username") String username);


    Optional<User> findByUsername(String username);

    void removeUserById(Long id);
}
