package com.keybean.creating_api2.service;

import com.keybean.creating_api2.dto.role.request.RoleCreateDto;
import com.keybean.creating_api2.dto.role.request.RoleUpdateDto;
import com.keybean.creating_api2.dto.role.response.RoleResponseDto;

import java.util.List;
import java.util.Optional;

public interface RoleService {

    List<RoleResponseDto> getAllRoles();
    Optional<RoleResponseDto> getRoleById(Long id);
    void createRole (RoleCreateDto dto);
    void updatedDto (RoleUpdateDto dto, Long id);
    void deleteRole (Long id);
}
