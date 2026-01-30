package com.example.api.service.impl;

import com.example.api.dto.user.request.UserCreateDto;
import com.example.api.dto.user.request.UserUpdateDto;
import com.example.api.dto.user.response.UserResponseDto;
import com.example.api.entity.User;
import com.example.api.exception.ConflictException;
import com.example.api.exception.NotFoundException;
import com.example.api.mapper.UserMapper;
import com.example.api.repository.UserRepository;
import com.example.api.service.UserService;
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

        if (dto.getEmail() != null &&
                userRepository.existsByEmailAndDeletedAtIsNull(dto.getEmail())) {
            throw new ConflictException("Email is already exist");
        }

        if (dto.getUsername() != null &&
                userRepository.existsByUsernameAndDeletedAtIsNull(dto.getUsername())) {
            throw new ConflictException("Username is already exist");
        }
        

        if (userRepository.existsByFirstNameAndLastNameAndDeletedIsNull(dto.getFirstName(), dto.getLastName())) {
            throw new ConflictException("Full name exist in database");
        }


        return null;
    }

    @Override
    public void updateUser(UserUpdateDto dto, Long id) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public void activateUser(Long id) {

    }
}
