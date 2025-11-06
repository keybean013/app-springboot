package com.keybean.creating_api2.service;

import com.keybean.creating_api2.dto.UserDTO;
import com.keybean.creating_api2.entity.User;

import java.util.List;

public interface UserService {

    User getById(Long id);

    List<UserDTO> getAllUsers();

}
