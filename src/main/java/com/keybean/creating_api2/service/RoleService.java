package com.keybean.creating_api2.service;

import com.keybean.creating_api2.dto.role.request.RoleCreateRequestDto;
import com.keybean.creating_api2.dto.role.request.RoleUpdateRequestDto;
import com.keybean.creating_api2.dto.role.response.RoleResponseDto;

import java.util.List;
import java.util.Optional;

public interface RoleService {

    List<RoleResponseDto> getAllRoles ();

    Optional<RoleResponseDto> getRoleById (Long id);

    RoleResponseDto createRole (RoleCreateRequestDto dto);

    String updateRole (RoleUpdateRequestDto dto, Long id);

    String deleteRole (Long id);

}
