package com.keybean.creating_api2.controller;

import com.keybean.creating_api2.dto.role.response.RoleResponseDto;
import com.keybean.creating_api2.service.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("role/{id}")
    public ResponseEntity<Optional<RoleResponseDto>> getRoleById (@PathVariable Long id) {
        Optional<RoleResponseDto> role = roleService.getRoleById(id);
        return  ResponseEntity.ok(role);
    }
}
