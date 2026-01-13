package com.keybean.creating_api2.service.implementation;

import com.keybean.creating_api2.dto.user.request.UserCreatedDto;
import com.keybean.creating_api2.dto.user.request.UserUpdateInfoDto;
import com.keybean.creating_api2.dto.user.request.UserUpdatePasswordDto;
import com.keybean.creating_api2.dto.user.response.UserResponseDto;
import com.keybean.creating_api2.dto.user.response.UserResponseInfoDto;
import com.keybean.creating_api2.entity.Role;
import com.keybean.creating_api2.entity.User;
import com.keybean.creating_api2.repository.RoleRepository;
import com.keybean.creating_api2.repository.UserRepository;
import com.keybean.creating_api2.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public List<UserResponseDto> getAllUsers() {
        return userRepository.findAllUsers();
    }

    @Override
    public List<UserResponseInfoDto> getAllUsersInfo() {
        return userRepository.findAllUsersInfo();
    }

    @Override
    public Optional<UserResponseDto> getUserByid(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public Optional<UserResponseInfoDto> getUserInfoById(Long id) {
        return userRepository.findUserInfoById(id);
    }

    @Override
    public void createUser(UserCreatedDto dto) {
        Role role = roleRepository.findById(dto.getRoleId())
                .orElseThrow(() -> new RuntimeException("Role not found"));

        User user = new User();

        user.setRole(role);
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setContactNo(dto.getContactNo());
        user.setAddress(dto.getAddress());
        user.setEmail(dto.getEmail());

        userRepository.save(user);
    }

    @Override
    public void updateUserInfo(UserUpdateInfoDto dto, Long id) {
        Role role = roleRepository.findById(dto.getRoleId())
                .orElseThrow(() -> new RuntimeException("Role not found."));

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setRole(role);
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setContactNo(dto.getContactNo());
        user.setAddress(dto.getAddress());
        user.setEmail(dto.getEmail());

        userRepository.save(user);
    }

    @Override
    public void updateUserPass(UserUpdatePasswordDto dto, Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setPassword(passwordEncoder.encode(dto.getPassword()));
    }

    @Override
    public void hardDeleteUser(Long id) {
        userRepository.removeUserById(id);
    }
}
