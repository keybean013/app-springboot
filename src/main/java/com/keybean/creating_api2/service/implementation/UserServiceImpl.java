package com.keybean.creating_api2.service.implementation;

import com.keybean.creating_api2.dto.user.request.UserCreateDto;
import com.keybean.creating_api2.dto.user.request.UserUpdateDto;
import com.keybean.creating_api2.dto.user.response.UserResponseDto;
import com.keybean.creating_api2.entity.Role;
import com.keybean.creating_api2.entity.User;
import com.keybean.creating_api2.exception.BadRequestException;
import com.keybean.creating_api2.exception.ConflictException;
import com.keybean.creating_api2.exception.NotFoundException;
import com.keybean.creating_api2.mapper.UserMapper;
import com.keybean.creating_api2.repository.RoleRepository;
import com.keybean.creating_api2.repository.UserRepository;
import com.keybean.creating_api2.service.UserService;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.naming.ConfigurationException;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;
    private final UserMapper userMapper;
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
                .orElseThrow(() -> new NotFoundException("User not found"));

        if(!user.isActive()) {
            throw new NotFoundException("User inactive");
        }

        return userMapper.toDto(user);
    }

    @Override
    public UserResponseDto createUser(UserCreateDto dto) {
        Role role = roleRepository.findByRoleNameAndDeletedAtIsNull(dto.getRoleName())
               .orElseThrow(()-> new NotFoundException("Role not found."));


        if (userRepository.existsByUsernameAndDeletedAtIsNull(dto.getUsername())) {
        throw new ConflictException("Username already exist.");
        }

        if (userRepository.existsByEmailAndDeletedAtIsNull((dto.getEmail()))) {
        throw new ConflictException("Email already exist.");
        }

        User user = userMapper.createDtoToEntity(dto);
        user.setRole(role);

        User saved = userRepository.save(user);

        return userMapper.toDto(saved);

    }

    @Override
    public String updateUser(UserUpdateDto dto, Long id) {

        User user = userRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(()-> new NotFoundException("User not found"));

        if (!user.isActive()) {
            throw new ConflictException("User must be activate or input active status is null");
        }

        if (dto.getRoleName() != null) {
            Role role = roleRepository
                    .findByRoleNameAndDeletedAtIsNull(dto.getRoleName())
                    .orElseThrow(() -> new NotFoundException("Role not found."));
            user.setRole(role);
        }

        userMapper.updatedDtoToEntity(dto, user);
        return "User updated successfully";

//       --->> OLD code
//        if (!user.isActive()) {
//            if (dto.getIsActive() == null || !dto.getIsActive()) {
//                throw new IllegalStateException(
//                    "Inactive user can only be reactivated."
//                );
//            }
//            user.setActive(true);
//            return "User activated successfully";
//        }

//        User user = userRepository.findByIdAndDeletedAtIsNull(id)
//                .orElseThrow(()-> new RuntimeException("User not found."));
//
//        if (!user.isActive()) {
//            if (dto.getIsActive() == null || !dto.getIsActive()) {
//                throw new IllegalStateException(
//                        "Inactive user can only be reactivated."
//                );
//            }
//            user.setActive(true);
//            return "User activated successfully";
//        }
//
//        Role role = roleRepository.findByRoleNameAndDeletedAtIsNull(dto.getRoleName())
//                .orElseThrow(()-> new RuntimeException("Role not found."));
//
//        user.setRole(role);
//        userMapper.updatedDtoToEntity(dto, user);
//
//        return "User updated successfully.";
    }



    @Override
    public String deleteUser(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(()-> new NotFoundException("User not found"));

        user.softDelete();
        user.setActive(false);

        userRepository.save(user);

        return "User deleted successfully.";
    }

    @Override
    public String activateUser(Long id) {

        User user = userRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(()-> new RuntimeException("User not found."));

        if (user.isActive()) {
            throw new ConflictException("User already active");
        }

        user.setActive(true);

        return "User activated successfully";
    }
}
