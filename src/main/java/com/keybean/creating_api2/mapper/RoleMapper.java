package com.keybean.creating_api2.mapper;

import com.keybean.creating_api2.dto.role.request.RoleUpdateDto;
import com.keybean.creating_api2.dto.role.response.RoleResponseDto;
import com.keybean.creating_api2.entity.Role;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring")
public interface RoleMapper {


    RoleResponseDto toDto(Role role);

    @Mapping(target = "users", ignore = true)
    Role toEntity(RoleResponseDto dto);
}

