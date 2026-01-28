package com.keybean.creating_api2.controller;

import com.keybean.creating_api2.dto.role.request.RoleCreateRequestDto;
import com.keybean.creating_api2.dto.role.request.RoleUpdateRequestDto;
import com.keybean.creating_api2.dto.role.response.RoleResponseDto;
import com.keybean.creating_api2.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/roles")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @GetMapping("/")
    public ResponseEntity<List<RoleResponseDto>> getAllRoles () {

        List<RoleResponseDto> roles = roleService.getAllRoles();

        return ResponseEntity.ok(roles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<RoleResponseDto>> getRoleById (@PathVariable Long id) {

        Optional<RoleResponseDto> role = roleService.getRoleById(id);

        return ResponseEntity.ok(role);
    }

    @PostMapping("/")
    public ResponseEntity<RoleResponseDto> createRole (@RequestBody RoleCreateRequestDto dto) {

        RoleResponseDto response = roleService.createRole(dto);

        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}/update")
    public  ResponseEntity<String> updateRole (
            @RequestBody RoleUpdateRequestDto dto,
            @PathVariable Long id
    ) {
        roleService.updateRole(dto, id);

        return ResponseEntity.ok("Role updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRole (@PathVariable Long id) {

        roleService.deleteRole(id);

        return ResponseEntity.ok("Role deleted successfully");
    }

}
