package com.keybean.back_end_api.service;

import com.keybean.back_end_api.dto.role.requst.RoleCreateRequestDto;
import com.keybean.back_end_api.dto.role.requst.RoleUpdateRequestDto;
import com.keybean.back_end_api.dto.role.response.RoleResponseDto;
import com.keybean.back_end_api.entity.Role;

import java.util.List;

public interface RoleService {

    List<RoleResponseDto> getAllRoles ();

    RoleResponseDto getRoleById (Long id);

    RoleResponseDto createdRole (RoleCreateRequestDto dto);

    void updateRole (RoleUpdateRequestDto dto, Long id);

    void deleteRole (Long id);

}
