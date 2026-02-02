package com.keybean.back_end_api.service;

import com.keybean.back_end_api.dto.role.request.RoleCreateRequestDto;
import com.keybean.back_end_api.dto.role.request.RoleUpdateRequestDto;
import com.keybean.back_end_api.dto.role.response.RoleResponseDto;

import java.util.List;

public interface RoleService {

    List<RoleResponseDto> getAllRoles ();

    RoleResponseDto getRoleById (Long id);

    RoleResponseDto createdRole (RoleCreateRequestDto dto);

    void updateRole (RoleUpdateRequestDto dto, Long id);

    void deleteRole (Long id);

}
