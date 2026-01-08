package com.keybean.creating_api2.repository;

import com.keybean.creating_api2.dto.user.UserResponseDto;
import com.keybean.creating_api2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("""
        SELECT new com.keybean.creating_api2.dto.user.UserResponseDto(
            u.id,
            r.id,
            u.username,
            u.firstName,
            u.lastName,
            u.email,
            u.isActive,
            u.sessionKey    
        )   
        FROM User u
        JOIN u.role r
        WHERE u.id = :id
    """)
    UserResponseDto findUserResponseById(Long id);

    @Query("""
        SELECT new com.keybean.creating_api2.dto.user.UserResponseDto(
            u.id,
            r.id,
            u.username,
            u.firstName,
            u.lastName,
            u.email,
            u.isActive,
            u.sessionKey    
        )   
        FROM User u
        JOIN u.role r
    """)
    List<UserResponseDto> findAllUserResponse();
}
