package com.keybean.creating_api2.service;

import com.keybean.creating_api2.dto.user.CreateUserDto;
import com.keybean.creating_api2.dto.user.UserResponseDto;
import com.keybean.creating_api2.dto.user.UserUpdateDto;

import java.util.List;

public interface UserService {
    UserResponseDto getUserById(Long id);
    List<UserResponseDto> getAllUserResponse();
    void createUser(CreateUserDto dto);
    void updateUser(Long id, UserUpdateDto dto);
    void deleteUser(Long id);
}
