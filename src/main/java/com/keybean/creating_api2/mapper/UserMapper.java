package com.keybean.creating_api2.mapper;

import com.keybean.creating_api2.dto.user.request.UserUpdateDto;
import com.keybean.creating_api2.dto.user.response.UserResponseDto;
import com.keybean.creating_api2.entity.*;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = RoleMapper.class)
public interface UserMapper {

//    @Mapping(source = "role", target = "role.id")
//    User toEntity(UserResponseDto dto);
//
//    @Mapping(source = "role", target = "role.id")
//    UserResponseDto toDto (User user);


    UserResponseDto toDto(User user);

    @Mapping(target = "id", ignore = true)
    User toEntity(UserResponseDto dto);
}
