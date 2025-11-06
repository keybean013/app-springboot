package com.keybean.creating_api2.service;

import com.keybean.creating_api2.dto.UserDTO;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public interface UserService {

  UserDTO getUserById(Long id);

  List<UserDTO> getAllUsers();

}
