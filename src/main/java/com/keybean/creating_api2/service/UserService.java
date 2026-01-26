package com.keybean.creating_api2.service;

import com.keybean.creating_api2.dto.user.request.UserUpdateDto;
import com.keybean.creating_api2.dto.user.response.UserResponseDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

    // Create a new user
    UserResponseDto createUser(UserUpdateDto dto);

    // Get user by ID
    Optional<UserResponseDto> getUserById(Long id);

    // Get all users
    List<UserResponseDto> getAllUsers();

    // Full update (PUT)
    UserResponseDto updateUser(Long id, UserUpdateDto dto);

    // Partial update (PATCH)
    UserResponseDto patchUser(Long id, UserUpdateDto dto);

    // Soft delete
    void deleteUser(Long id);

}
