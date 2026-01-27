package com.keybean.creating_api2.controller;


import com.keybean.creating_api2.dto.user.request.UserCreateDto;
import com.keybean.creating_api2.dto.user.response.UserResponseDto;
import com.keybean.creating_api2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserResponseDto>> getUserById (@PathVariable Long id) {
        Optional<UserResponseDto> users = userService.getUserById(id);
        return ResponseEntity.ok(users);
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> createUser (@RequestBody UserCreateDto dto) {
        UserResponseDto users = userService.createUser(dto);
        return ResponseEntity.ok(users);

    }

}
