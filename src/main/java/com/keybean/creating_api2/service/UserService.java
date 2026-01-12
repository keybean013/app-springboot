package com.keybean.creating_api2.service;

import com.keybean.creating_api2.dto.user.request.UserCreatedDto;
import com.keybean.creating_api2.dto.user.request.UserUpdateInfoDto;
import com.keybean.creating_api2.dto.user.request.UserUpdatePasswordDto;
import com.keybean.creating_api2.dto.user.response.UserResponseDto;
import com.keybean.creating_api2.dto.user.response.UserResponseInfoDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserResponseDto> getAllUsers();
    List<UserResponseInfoDto> getAllUsersInfo();
    Optional<UserResponseDto> getUserByid(Long id);
    Optional<UserResponseInfoDto> getUserInfoById(Long id);
    void createUser (UserCreatedDto dto);
    void updateUserInfo (UserUpdateInfoDto dto,  Long id);
    void updateUserPass (UserUpdatePasswordDto dto, Long id);
    void hardDeleteUser(Long id);
}
