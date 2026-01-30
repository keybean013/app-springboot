package com.example.api.service;

import com.example.api.dto.role.request.RoleCreateDto;
import com.example.api.dto.role.request.RoleUpdateDto;
import com.example.api.dto.role.response.RoleResponseDto;

import java.util.List;
import java.util.Optional;

public interface RoleService {

    RoleResponseDto getRoleById (Long id);

    List<RoleResponseDto> getAllRole ();

    RoleResponseDto createRole (RoleCreateDto dto);

    void updateRole (RoleUpdateDto dto, Long id);

    void deleteRole (Long id);

}
