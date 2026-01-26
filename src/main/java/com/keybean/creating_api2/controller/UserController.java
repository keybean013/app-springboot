package com.keybean.creating_api2.controller;


import com.keybean.creating_api2.dto.user.response.UserResponseDto;
import com.keybean.creating_api2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
