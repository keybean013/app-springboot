package com.example.api.mapper;

import com.example.api.dto.user.request.UserCreateDto;
import com.example.api.dto.user.request.UserUpdateDto;
import com.example.api.dto.user.response.UserResponseDto;
import com.example.api.entity.User;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponseDto toDto (User user);

    @Mapping(target = "id", ignore = true)
    User createToEntity (UserCreateDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "role", ignore = true)
    void updateToEntity (UserUpdateDto dto, @MappingTarget User user);

}
