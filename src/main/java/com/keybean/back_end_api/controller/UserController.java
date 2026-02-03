package com.keybean.back_end_api.controller;

import com.keybean.back_end_api.dto.user.request.UserChangePasswordRequestDto;
import com.keybean.back_end_api.dto.user.request.UserCreateRequestDto;
import com.keybean.back_end_api.dto.user.request.UserUpdateRequestDto;
import com.keybean.back_end_api.dto.user.response.UserResponseDto;
import com.keybean.back_end_api.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<UserResponseDto>> getAllUsers () {

        List<UserResponseDto> users = userService.getAllUsers();

        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getUserById (@PathVariable Long id) {

        UserResponseDto user = userService.getUserById(id);

        return ResponseEntity.ok(user);
    }

    @PostMapping("/")
    public ResponseEntity<UserResponseDto> createUser (@Valid @RequestBody UserCreateRequestDto dto) {

        UserResponseDto userCreated = userService.createUser(dto);

        return ResponseEntity.ok(userCreated);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<String> updateUser (
            @Valid
            @RequestBody UserUpdateRequestDto dto,
            @PathVariable Long id
    ) {

        userService.updateUser(dto, id);

        return ResponseEntity.ok("User update successfully");

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser (@PathVariable Long id) {

        userService.deleteUser(id);

        return ResponseEntity.ok("User deleted successfully");
    }

    @PutMapping("/{id}/activeStatus")
    public ResponseEntity<String> updateIsActive (
            @RequestBody UserUpdateRequestDto dto,
            @PathVariable Long id) {

        userService.activateUser(dto, id);

        return ResponseEntity.ok("Active status updated successfully");
    }

    @PatchMapping("/{id}/change-password")
    public ResponseEntity<String> changePassword (
            @PathVariable Long id,
            @Valid @RequestBody UserChangePasswordRequestDto dto
            ) {

        userService.changePassword(dto, id);

        return ResponseEntity.ok("Password changed successfully.");
    }

}
