package com.keybean.creating_api2.service;


import com.keybean.creating_api2.dto.user.UserCreateDto;
import com.keybean.creating_api2.dto.user.UserResponseDto;
import com.keybean.creating_api2.dto.user.UserUpdateDto;

import java.util.List;

public interface UserService {

    List<UserResponseDto> getAllUsers();
    UserResponseDto getUserById(Long id);
    void createUser(UserCreateDto dto);
    void updateUser(Long id, UserUpdateDto dto);
    void deleteUser (Long id);
}
//
//public interface UserService {
//
//    UserResponseDto getUserById(Long id);
//
//    List<UserResponseDto> getAllUsers();
//
//    void createUser(UserCreateDto dto);
//
//    void updateUser(Long id, UserUpdateDto dto);
//
//    void deleteUser(Long id);
//}
