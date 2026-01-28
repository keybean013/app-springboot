package com.keybean.creating_api2.mapper;

import com.keybean.creating_api2.dto.role.request.RoleCreateRequestDto;
import com.keybean.creating_api2.dto.role.request.RoleUpdateRequestDto;
import com.keybean.creating_api2.dto.role.response.RoleResponseDto;
import com.keybean.creating_api2.entity.Role;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleResponseDto toDto (Role role);

    @Mapping(target = "id", ignore = true)
    Role createRole (RoleCreateRequestDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRole (RoleUpdateRequestDto dto, @MappingTarget Role role);

}
