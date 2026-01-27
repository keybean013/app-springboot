package com.keybean.creating_api2.mapper;

import com.keybean.creating_api2.dto.user.request.UserCreateDto;
import com.keybean.creating_api2.dto.user.response.UserResponseDto;
import com.keybean.creating_api2.entity.*;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UserMapper {

//    @Mapping(source = "role", target = "role.id")
//    User toEntity(UserResponseDto dto);
//
//    @Mapping(source = "role", target = "role.id")
//    UserResponseDto toDto (User user);


    @Mapping(source = "role.roleName", target = "roleName")
    UserResponseDto toDto(User user);

    @Mapping(target = "id", ignore = true)
    User toEntity(UserCreateDto dto);
}
