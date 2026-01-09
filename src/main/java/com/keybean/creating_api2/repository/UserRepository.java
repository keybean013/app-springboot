package com.keybean.creating_api2.repository;

import com.keybean.creating_api2.dto.user.UserResponseDto;
import com.keybean.creating_api2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

     //The query Must be same to the exact parameter or data of DTO
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
    UserResponseDto findUserById(Long id);

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
    List<UserResponseDto> findAllUsers();

    Long id(Long id);
}
//
//public interface UserRepository extends JpaRepository<User, Long> {
//
//
//    // The query Must be same to the exact parameter or data of DTO
//    @Query("""
//        SELECT new com.keybean.user_api.dto.UserResponseDto(
//            u.id,
//            r.id,
//            u.username,
//            u.firstName,
//            u.lastName,
//            u.email,
//            u.isActive,
//            u.sessionKey
//        )
//        FROM User u
//        JOIN u.role r
//        WHERE u.id = :id
//    """)
//    UserResponseDto findUserResponseById(Long id);
//
//    @Query("""
//        SELECT new com.keybean.user_api.dto.UserResponseDto(
//            u.id,
//            r.id,
//            u.username,
//            u.firstName,
//            u.lastName,
//            u.email,
//            u.isActive,
//            u.sessionKey
//        )
//        FROM User u
//        JOIN u.role r
//    """)
//    List<UserResponseDto> findAllUserResponses();
//}
