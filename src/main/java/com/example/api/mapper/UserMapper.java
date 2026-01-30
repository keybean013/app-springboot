package com.example.api.mapper;

import com.example.api.dto.role.request.RoleCreateDto;
import com.example.api.dto.user.request.UserUpdateDto;
import com.example.api.dto.user.response.UserResponseDto;
import com.example.api.entity.User;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponseDto toDto (User user);

    @Mapping(target = "id", ignore = true)
    User createToEntity (RoleCreateDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "role", ignore = true)
    User updateToEntity (UserUpdateDto dto, @MappingTarget User user);

}
