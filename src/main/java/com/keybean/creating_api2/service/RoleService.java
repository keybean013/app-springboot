package com.keybean.creating_api2.service;

import com.keybean.creating_api2.dto.request.RoleCreateRequestDto;
import com.keybean.creating_api2.dto.request.RoleUpdateRequestDto;
import com.keybean.creating_api2.dto.response.RoleResponseDto;
import com.keybean.creating_api2.entity.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {

    List<RoleResponseDto> getAllRoles ();

    Optional<RoleResponseDto> getRoleById (Long id);

    RoleResponseDto createRole (RoleCreateRequestDto dto);

    String updateRole (RoleUpdateRequestDto dto, Long id);

    String deleteRole (Long id);

}
