package com.keybean.back_end_api.service;

import com.keybean.back_end_api.dto.user.request.UserCreateDto;
import com.keybean.back_end_api.dto.user.request.UserUpdateDto;
import com.keybean.back_end_api.dto.user.response.UserResponseDto;

import java.util.List;

public interface UserService {

    List<UserResponseDto> getAllUsers();

    UserResponseDto getUserById (Long id);

    void createdUser (UserCreateDto dto);

    void updateUser (UserUpdateDto dto);

    void deleteUser (Long id);
}
