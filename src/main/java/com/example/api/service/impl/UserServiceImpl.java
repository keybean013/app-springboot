package com.example.api.service.impl;

import com.example.api.dto.user.request.UserCreateDto;
import com.example.api.dto.user.request.UserSetIsActive;
import com.example.api.dto.user.request.UserUpdateDto;
import com.example.api.dto.user.response.UserResponseDto;
import com.example.api.entity.Role;
import com.example.api.entity.User;
import com.example.api.exception.NotFoundException;
import com.example.api.mapper.UserMapper;
import com.example.api.repository.RoleRepository;
import com.example.api.repository.UserRepository;
import com.example.api.service.UserService;
import com.example.api.validator.UserValidator;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Transactional
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final UserValidator userValidator;
    private final RoleRepository roleRepository;


    @Override
    public List<UserResponseDto> getAllUsers() {
        return userRepository.findAllByDeletedAtIsNull()
                .stream()
                .map(userMapper::toDto).toList();
    }

    @Override
    public UserResponseDto getUserById(Long id) {
        User user = userRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(()-> new NotFoundException("Role not found"));

        return userMapper.toDto(user);
    }

    @Override
    public UserResponseDto createUser(UserCreateDto dto) {

        Role role = roleRepository.findByRoleNameAndDeletedAtIsNull(dto.getRoleName())
                        .orElseThrow(()-> new NotFoundException("Role not found"));

        userValidator.checkUniqueUsername(dto.getUsername());
        userValidator.checkUniqueEmail(dto.getEmail());
        userValidator.checkUniqueFullName(dto.getFirstName(), dto.getLastName());

        User user = userMapper.createToEntity(dto);
        user.setRole(role);
        User createdUser = userRepository.save(user);


        return userMapper.toDto(createdUser);
    }

    @Override
    public void updateUser(UserUpdateDto dto, Long id) {

        User user = userRepository.findByIdAndDeletedAtIsNull(id)
                        .orElseThrow(()-> new NotFoundException("User Not found"));

        if (dto.getRoleName() != null) {
            Role role = roleRepository.findByRoleNameAndDeletedAtIsNull(dto.getRoleName())
                    .orElseThrow(()-> new NotFoundException("Role not found"));
            user.setRole(role);
        }

        userValidator.checkUniqueEmail(dto.getEmail());
        userValidator.checkUniqueFullName(dto.getFirstName(), dto.getLastName());

        userMapper.updateToEntity(dto, user);
    }

    @Override
    public void deleteUser(Long id) {

        User user = userRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(()-> new NotFoundException("User Not found"));

        user.softDelete();

        userRepository.save(user);
    }

    @Override
    public void activateUser(UserSetIsActive dto, Long id) {

        User user = userRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(()-> new NotFoundException("User Not found"));

        user.setActive(true);

    }
}
