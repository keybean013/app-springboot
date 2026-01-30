package com.example.api.service;

import com.example.api.dto.user.request.UserCreateDto;
import com.example.api.dto.user.request.UserUpdateDto;
import com.example.api.dto.user.response.UserResponseDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<UserResponseDto> getRoleById (Long id);

    List<UserResponseDto> getAllRole ();

    UserResponseDto createRole (UserCreateDto dto);

    void updateRole (UserUpdateDto dto, Long id);

    void deleteRole (Long id);

    void activateUser (Long id);
}
