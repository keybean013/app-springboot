package com.keybean.creating_api2.controller;

import com.keybean.creating_api2.dto.user.request.UserCreateDto;
import com.keybean.creating_api2.dto.user.request.UserUpdateDto;
import com.keybean.creating_api2.dto.user.response.UserResponseDto;
import com.keybean.creating_api2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

   private final UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<UserResponseDto>> getAllUsers () {

        List<UserResponseDto> users = userService.getAllUsers();

        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserResponseDto>> getUserById (@PathVariable Long id) {

        Optional<UserResponseDto> users = userService.getUserById(id);

        return ResponseEntity.ok(users);
    }

    @PostMapping("/")
    public ResponseEntity<UserResponseDto> createUser (@RequestBody UserCreateDto dto) {

        UserResponseDto createdUser = userService.createUser(dto);

        return ResponseEntity.ok(createdUser);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<String> updateUser (
            @RequestBody UserUpdateDto dto,
            @PathVariable Long id
            ) {
        userService.updateUser(dto, id);

        return ResponseEntity.ok("User update successfully.");

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser (Long id) {

        userService.deleteUser(id);

        return ResponseEntity.ok("User deleted successfully");
    }

}
