package com.keybean.creating_api2.service;

import com.keybean.creating_api2.dto.user.request.UserCreateDto;
import com.keybean.creating_api2.dto.user.request.UserUpdateDto;
import com.keybean.creating_api2.dto.user.response.UserResponseDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserResponseDto> getAllUsers();
    Optional<UserResponseDto> getUserById(Long id);
    void createUser(UserCreateDto dto);
    void updateUser(UserUpdateDto dto, Long id);
    void deleteUser(Long id);
}
