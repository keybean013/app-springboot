package com.keybean.back_end_api.service.impl;

import com.keybean.back_end_api.dto.user.request.UserCreateRequestDto;
import com.keybean.back_end_api.dto.user.request.UserUpdateRequestDto;
import com.keybean.back_end_api.dto.user.response.UserResponseDto;
import com.keybean.back_end_api.entity.Role;
import com.keybean.back_end_api.entity.User;
import com.keybean.back_end_api.exception.BadRequestException;
import com.keybean.back_end_api.exception.NotFoundException;
import com.keybean.back_end_api.mapper.UserMapper;
import com.keybean.back_end_api.repository.RoleRepository;
import com.keybean.back_end_api.repository.UserRepository;
import com.keybean.back_end_api.service.UserService;
import com.keybean.back_end_api.validator.UserValidator;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Transactional
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final UserValidator userValidator;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    @Override
    public List<UserResponseDto> getAllUsers() {

        return userRepository.findAllByDeletedAtIsNull()
                .stream()
                .map(userMapper::toDto)
                .toList();

    }

    @Override
    public UserResponseDto getUserById(Long id) {

        User user = userRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(() -> new NotFoundException("User not found"));

        return userMapper.toDto(user);
    }

    @Override
    public UserResponseDto createUser(UserCreateRequestDto dto) {

        Role role = roleRepository.findByRoleNameAndDeletedAtIsNull(dto.getRoleName())
                .orElseThrow(() -> new NotFoundException("Role not found"));

        userValidator.checkUniqueEmail(dto.getEmail());
        userValidator.checkUniqueUsername(dto.getUsername());
        userValidator.checkUniqueFullName(dto.getFirstName(), dto.getLastName());

        User user = userMapper.create(dto);

        user.setRole(role);

        user.setPassword(passwordEncoder.encode(dto.getPassword()));

        userRepository.save(user);

        return userMapper.toDto(user);
    }

    @Override
    public void updateUser(UserUpdateRequestDto dto, Long id) {

        User user = userRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(()-> new NotFoundException("User not found."));

        Role role = roleRepository.findByRoleNameAndDeletedAtIsNull(dto.getRoleName())
                .orElseThrow(()-> new NotFoundException("Role not found."));

        if (!user.isActive()) {
            throw new BadRequestException("User inactive, activate user first.");
        }

        userValidator.checkUniqueEmail(dto.getEmail());
        userValidator.checkUniqueUsername(dto.getUsername());
        userValidator.checkUniqueFullName(dto.getFirstName(), dto.getLastName());
        userValidator.isActivateValidator(dto.getIsActive());

        userMapper.update(dto, user);

        user.setRole(role);

        userRepository.save(user);

    }

    @Override
    public void deleteUser(Long id) {

        User user = userRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(() -> new NotFoundException("User not found."));

        user.softDelete();

        userRepository.save(user);
    }
}
