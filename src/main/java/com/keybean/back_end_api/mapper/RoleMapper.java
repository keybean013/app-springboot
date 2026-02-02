package com.keybean.back_end_api.mapper;


import com.keybean.back_end_api.dto.role.request.RoleCreateRequestDto;
import com.keybean.back_end_api.dto.role.request.RoleUpdateRequestDto;
import com.keybean.back_end_api.dto.role.response.RoleResponseDto;
import com.keybean.back_end_api.entity.Role;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleResponseDto toDto(Role role);

    @Mapping(target = "status", ignore = true)
    Role create (RoleCreateRequestDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "status", ignore = true)
    void update (RoleUpdateRequestDto dto,@MappingTarget Role role);

}
