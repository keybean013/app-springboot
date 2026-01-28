package com.keybean.creating_api2.mapper;

import com.keybean.creating_api2.dto.user.request.UserCreateDto;
import com.keybean.creating_api2.dto.user.request.UserUpdateDto;
import com.keybean.creating_api2.dto.user.response.UserResponseDto;
import com.keybean.creating_api2.entity.User;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponseDto toDto(User user);

    User createDtoToEntity(UserCreateDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "role", ignore = true)
    void updatedDtoToEntity(UserUpdateDto dto, @MappingTarget User user);
}
