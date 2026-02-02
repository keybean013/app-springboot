package com.keybean.back_end_api.controller;

import com.keybean.back_end_api.dto.role.requst.RoleCreateRequestDto;
import com.keybean.back_end_api.dto.role.requst.RoleUpdateRequestDto;
import com.keybean.back_end_api.dto.role.response.RoleResponseDto;
import com.keybean.back_end_api.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/roles")
public class RoleController {

    public final RoleService roleService;


    @GetMapping("/")
    public ResponseEntity<List<RoleResponseDto>> getAllRoles() {

        List<RoleResponseDto> roles = roleService.getAllRoles();

        return ResponseEntity.ok(roles);

    }

    @GetMapping("{id}")
    public ResponseEntity<RoleResponseDto> getRoleById(@PathVariable Long id) {

        RoleResponseDto role = roleService.getRoleById(id);

        return ResponseEntity.ok(role);

    }

    @PostMapping("/")
    public ResponseEntity<RoleResponseDto> createRole(@RequestBody RoleCreateRequestDto dto) {

        RoleResponseDto createdRole = roleService.createdRole(dto);

        return ResponseEntity.ok(createdRole);

    }

    @PutMapping("/{id}/update")
    public ResponseEntity<String> updateRole(
            @RequestBody RoleUpdateRequestDto dto,
            @PathVariable Long id
    ) {

        roleService.updateRole(dto, id);

        return ResponseEntity.ok("Role updated successfully.");

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRole (@PathVariable Long id) {

        roleService.deleteRole(id);

        return ResponseEntity.ok("Role deleted successfully");

    }
}
