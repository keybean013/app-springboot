package com.keybean.creating_api2.service.serviceImpl;

import com.keybean.creating_api2.dto.user.request.UserCreateDto;
import com.keybean.creating_api2.dto.user.request.UserUpdateDto;
import com.keybean.creating_api2.dto.user.response.UserResponseDto;
import com.keybean.creating_api2.entity.Role;
import com.keybean.creating_api2.entity.User;
import com.keybean.creating_api2.repository.RoleRepository;
import com.keybean.creating_api2.repository.UserRepository;
import com.keybean.creating_api2.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    public final UserRepository userRepository;
    public final RoleRepository roleRepository;


    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }


    @Override
    public List<UserResponseDto> getAllUsers() {
        return userRepository.findAllUsers();
    }

    @Override
    public Optional<UserResponseDto> getUserById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public void createUser(UserCreateDto dto) {
        Role role = roleRepository.findById(dto.getRoleId())
                .orElseThrow(() -> new RuntimeException("Role not found"));

        User user = new User();
        user.setRole(role);
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setCreated(dto.getCreated());
        user.setUpdated(dto.getUpdated());
        user.setActive(dto.getActive());

        userRepository.save(user);

    }

    @Override
    public void updateUser(UserUpdateDto dto, Long id) {
        Role role = roleRepository.findById(dto.getRoleId())
                .orElseThrow(() -> new RuntimeException("Role not found."));
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found."));

        user.setRole(role);
        user.setUsername(dto.getUsername());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setUpdated(dto.getUpdated());

        userRepository.save(user);

    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
