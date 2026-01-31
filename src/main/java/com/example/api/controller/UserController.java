package com.example.api.controller;


import com.example.api.dto.user.request.UserCreateDto;
import com.example.api.dto.user.request.UserSetIsActive;
import com.example.api.dto.user.request.UserUpdateDto;
import com.example.api.dto.user.response.UserResponseDto;
import com.example.api.service.UserService;
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
    public ResponseEntity<List<UserResponseDto>> getAllUser () {

        List<UserResponseDto> users = userService.getAllUsers();

        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getUserById (@PathVariable Long id) {

        UserResponseDto user = userService.getUserById(id);

        return ResponseEntity.ok(user);
    }

    @PostMapping("/")
    public ResponseEntity<UserResponseDto> createUser (@Valid @RequestBody UserCreateDto dto){

        UserResponseDto createdUser = userService.createUser(dto);

        return ResponseEntity.ok(createdUser);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<String> updateUser (
            @Valid @RequestBody UserUpdateDto dto,
            @PathVariable Long id
    ) {
        userService.updateUser(dto, id);

        return ResponseEntity.ok("User updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser (@PathVariable Long id) {
        userService.deleteUser(id);

        return ResponseEntity.ok("User deleted successfully");
    }

    @PutMapping("/{id}/active")
    public ResponseEntity<String> setActive (
            @RequestBody UserSetIsActive dto, @PathVariable Long id) {
        userService.activateUser(dto, id);

        return ResponseEntity.ok("User deleted successfully");
    }


}
