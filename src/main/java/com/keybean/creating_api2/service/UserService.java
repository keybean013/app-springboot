package com.keybean.creating_api2.service;

import com.keybean.creating_api2.dto.user.request.UserCreateDto;
import com.keybean.creating_api2.dto.user.request.UserUpdateDto;
import com.keybean.creating_api2.dto.user.response.UserResponseDto;
import com.keybean.creating_api2.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserResponseDto> getAllUsers ();

    Optional<UserResponseDto> getUserById (Long id);

    UserResponseDto createUser (UserCreateDto dto);

    String updateUser (UserUpdateDto dto, Long id);

    String deleteUser (Long id);
}
