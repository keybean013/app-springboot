package com.keybean.creating_api2.service.impl;

import com.keybean.creating_api2.dto.user.UserCreateDto;
import com.keybean.creating_api2.dto.user.UserResponseDto;
import com.keybean.creating_api2.dto.user.UserUpdateDto;
import com.keybean.creating_api2.entity.Role;
import com.keybean.creating_api2.entity.User;
import com.keybean.creating_api2.repository.RoleRepository;
import com.keybean.creating_api2.repository.UserRepository;
import com.keybean.creating_api2.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;


    public UserServiceImp(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }


    @Override
    public List<UserResponseDto> getAllUsers() {
        return userRepository.findAllUsers();
    }

    @Override
    public UserResponseDto getUserById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public void createUser(UserCreateDto dto) {
        Role role = roleRepository.findById(dto.getRoleId())
                .orElseThrow(() -> new RuntimeException("Role not found"));
        User user = new User();
        user.setRole(role);
        user.setUsername(dto.getUsername());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());

        userRepository.save(user);
    }

    @Override
    public void updateUser(Long id, UserUpdateDto dto) {
        Role role = roleRepository.findById(dto.getRoleId())
                .orElseThrow(() -> new RuntimeException("Role not found"));

        User user = userRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("User not found"));

        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setRole(role);

        userRepository.save(user);

    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


}
//
//
//
//
////import com.keybean.user_api.dto.UserCreateDto;
////import com.keybean.user_api.dto.UserResponseDto;
////import com.keybean.user_api.dto.UserUpdateDto;
////import com.keybean.user_api.entity.Role;
////import com.keybean.user_api.entity.User;
////import com.keybean.user_api.repository.RoleRepository;
////import com.keybean.user_api.repository.UserRepository;
////import com.keybean.user_api.service.UserService;
////import jakarta.transaction.Transactional;
////import org.springframework.stereotype.Service;
//
////import java.util.List;
////
////@Service
////@Transactional
////public class UserServiceImp  implements UserService {
////
////    private final UserRepository userRepository;
////
////    private final RoleRepository roleRepository;
////
////    public UserServiceImp(UserRepository userRepository, RoleRepository roleRepository) {
////        this.userRepository = userRepository;
////        this.roleRepository = roleRepository;
////    }
////
////    @Override
////    public UserResponseDto getUserById(Long id) {
////        return userRepository.findUserResponseById(id);
////    }
////
////    @Override
////    public List<UserResponseDto> getAllUsers() {
////        return userRepository.findAllUserResponses();
////    }
////
////
////    @Override
////    public void createUser(UserCreateDto dto) {
////        Role role = roleRepository.findById(dto.getRoleId())
////                .orElseThrow(() -> new RuntimeException("Role not found"));
////
////        User user = new User();
////        user.setRole(role);
////        user.setUsername(dto.getUsername());
////        user.setPassword(dto.getPassword()); // hash later
////        user.setFirstName(dto.getFirstName());
////        user.setLastName(dto.getLastName());
////        user.setEmail(dto.getEmail());
////        user.setActive(true);
////
////        userRepository.save(user);
////    }
////
////    @Override
////    public void updateUser(Long id, UserUpdateDto dto) {
////        User user = userRepository.findById(id)
////                .orElseThrow(() -> new RuntimeException("User not found"));
////
////        Role role = roleRepository.findById(dto.getRoleId())
////                .orElseThrow(() -> new RuntimeException("Role not found"));
////
////        user.setRole(role);
////        user.setFirstName(dto.getFirstName());
////        user.setLastName(dto.getLastName());
////        user.setEmail(dto.getEmail());
////        user.setActive(dto.isActive());
////
////        userRepository.save(user);
////    }
////
////    @Override
////    public void deleteUser(Long id) {
////        userRepository.deleteById(id);
////    }
////}
