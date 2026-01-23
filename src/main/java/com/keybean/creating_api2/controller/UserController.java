package com.keybean.creating_api2.controller;

import com.keybean.creating_api2.dto.user.request.UserCreatedDto;
import com.keybean.creating_api2.dto.user.request.UserUpdateInfoDto;
import com.keybean.creating_api2.dto.user.request.UserUpdatePasswordDto;
import com.keybean.creating_api2.dto.user.response.UserResponseDto;
import com.keybean.creating_api2.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserResponseDto>> getAllUsers () {
        List<UserResponseDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<Optional<UserResponseDto>> getUserById (@PathVariable Long id) {
        Optional<UserResponseDto> user = userService.getUserByid(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/user")
    public ResponseEntity<Void> createUser (@RequestBody UserCreatedDto dto) {
        userService.createUser(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<Void> updateUserInfo (@RequestBody UserUpdateInfoDto dto, @PathVariable Long id) {
        userService.updateUserInfo(dto, id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/user/{id}/password")
    public ResponseEntity<Void> updateUserPass (@RequestBody UserUpdatePasswordDto dto, @PathVariable Long id) {
        userService.updateUserPass(dto, id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> hardDeleteUser (@PathVariable Long id) {
        userService.hardDeleteUser(id);
        return ResponseEntity.notFound().build();
    }

}
