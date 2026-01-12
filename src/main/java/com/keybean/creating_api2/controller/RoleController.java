package com.keybean.creating_api2.controller;

import com.keybean.creating_api2.dto.role.request.RoleCreateDto;
import com.keybean.creating_api2.dto.role.request.RoleUpdateDto;
import com.keybean.creating_api2.dto.role.response.RoleResponseDto;
import com.keybean.creating_api2.service.RoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping("/roles")
    public ResponseEntity<List<RoleResponseDto>> getAllRoles () {
        List<RoleResponseDto> roles = roleService.getAllRoles();
        return ResponseEntity.ok(roles);
    }
    @RequestMapping("/role/{id}")
    public ResponseEntity<Optional<RoleResponseDto>> getRoleById (@PathVariable Long id) {
        Optional<RoleResponseDto> role = roleService.getRoleById(id);
        return  ResponseEntity.ok(role);
    }

    @PostMapping("role/new")
    public ResponseEntity<Void> createRole (@RequestBody RoleCreateDto dto) {
        roleService.createRole(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("role/{id}")
    public  ResponseEntity<Void> updateRole (
            @RequestBody RoleUpdateDto dto,
            @PathVariable Long id
    ) {
        roleService.updateRole(dto, id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("role/{id}")
    public ResponseEntity<Void> deleteRole (@PathVariable Long id) {
        roleService.deleteRole(id);
        return ResponseEntity.noContent().build();
    }
}
