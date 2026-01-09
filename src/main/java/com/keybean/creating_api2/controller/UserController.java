package com.keybean.creating_api2.controller;


import com.keybean.creating_api2.dto.user.UserCreateDto;
import com.keybean.creating_api2.dto.user.UserResponseDto;
import com.keybean.creating_api2.dto.user.UserUpdateDto;
import com.keybean.creating_api2.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 🔹 GET /api/users
    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAllUsers() {
        List<UserResponseDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    // 🔹 GET /api/users/{id}
    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable Long id) {
        UserResponseDto user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    // 🔹 POST /api/users
    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody UserCreateDto dto) {
        userService.createUser(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    // 🔹 PUT /api/users/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateUser(
            @PathVariable Long id,
            @RequestBody UserUpdateDto dto) {

        userService.updateUser(id, dto);
        return ResponseEntity.noContent().build();
    }

    // 🔹 DELETE /api/users/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}

