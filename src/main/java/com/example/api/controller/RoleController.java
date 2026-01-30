package com.example.api.controller;


import com.example.api.dto.role.request.RoleCreateDto;
import com.example.api.dto.role.request.RoleUpdateDto;
import com.example.api.dto.role.response.RoleResponseDto;
import com.example.api.service.RoleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/roles")
public class RoleController {

    private final RoleService roleService;

    @GetMapping("/")
    public ResponseEntity<List<RoleResponseDto>> getAllRoles () {

        List<RoleResponseDto> roles = roleService.getAllRole();

        return ResponseEntity.ok(roles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoleResponseDto> getRoleById (@PathVariable Long id) {

        RoleResponseDto role = roleService.getRoleById(id);

        return ResponseEntity.ok(role);
    }

    @PostMapping("/")
    public ResponseEntity<RoleResponseDto> createRole (@RequestBody RoleCreateDto dto) {

        RoleResponseDto roleCreated = roleService.createRole(dto);

        return ResponseEntity.ok(roleCreated);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<String> updateRole (
            @Valid @RequestBody RoleUpdateDto dto,
            @PathVariable Long id) {

        roleService.updateRole(dto, id);

        return ResponseEntity.ok("Role created successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRole (@PathVariable Long id) {

        roleService.deleteRole(id);

        return ResponseEntity.ok("Role deleted successfully");

    }

}
