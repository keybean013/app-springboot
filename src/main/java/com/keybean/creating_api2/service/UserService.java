package com.keybean.creating_api2.service;

import com.keybean.creating_api2.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO getUserById(Long id);

    List<UserDTO> getAllUsers();

}
