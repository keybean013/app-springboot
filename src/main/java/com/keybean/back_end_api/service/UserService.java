package com.keybean.back_end_api.service;

import com.keybean.back_end_api.dto.user.request.UserCreateRequestDto;
import com.keybean.back_end_api.dto.user.request.UserUpdateRequestDto;
import com.keybean.back_end_api.dto.user.response.UserResponseDto;
import com.keybean.back_end_api.entity.User;

import java.util.List;

public interface UserService {

    List<UserResponseDto> getAllUsers ();

    UserResponseDto getUserById (Long id);

    UserResponseDto createUser (UserCreateRequestDto dto);

    void updateUser (UserUpdateRequestDto dto, Long id);

    void deleteUser (Long id);

}
