package com.keybean.back_end_api.service;

import com.keybean.back_end_api.dto.role.request.RoleCreateDto;
import com.keybean.back_end_api.dto.role.request.RoleUpdateDto;
import com.keybean.back_end_api.dto.role.response.RoleResponseDto;

import java.util.List;

public interface RoleService {

    List<RoleResponseDto> getAllRoles();

    RoleResponseDto getRoleById (Long id);

    RoleResponseDto createRole (RoleCreateDto dto);

    void updateRole (RoleUpdateDto dto, Long id);

    void deleteRole (Long id);

}
