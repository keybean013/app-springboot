package com.keybean.back_end_api.mapper;


import com.keybean.back_end_api.dto.role.request.RoleCreateDto;
import com.keybean.back_end_api.dto.role.request.RoleUpdateDto;
import com.keybean.back_end_api.dto.role.response.RoleResponseDto;
import com.keybean.back_end_api.entity.Role;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleResponseDto toDto (Role role);

    Role createRole (RoleCreateDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRole (RoleUpdateDto dto, Role role);

}
