package com.example.api.service;

import com.example.api.dto.user.request.UserCreateDto;
import com.example.api.dto.user.request.UserUpdateDto;
import com.example.api.dto.user.response.UserResponseDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserResponseDto> getAllUsers ();

    UserResponseDto getUserById (Long id);

    UserResponseDto createUser (UserCreateDto dto);

    void updateUser (UserUpdateDto dto, Long id);

    void deleteUser (Long id);

    void activateUser (Long id);
}
