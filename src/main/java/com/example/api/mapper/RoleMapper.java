package com.example.api.mapper;


import com.example.api.dto.role.request.RoleCreateDto;
import com.example.api.dto.role.request.RoleUpdateDto;
import com.example.api.dto.role.response.RoleResponseDto;
import com.example.api.entity.Role;

import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleResponseDto toDto(Role role);

    @Mapping(target = "id", ignore = true)
    Role toEntity (RoleCreateDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Role updateEntity (RoleUpdateDto dto, @MappingTarget Role role);



}
