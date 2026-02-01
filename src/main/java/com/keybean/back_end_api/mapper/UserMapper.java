package com.keybean.back_end_api.mapper;

import com.keybean.back_end_api.dto.user.request.UserCreateDto;
import com.keybean.back_end_api.dto.user.request.UserUpdateDto;
import com.keybean.back_end_api.dto.user.response.UserResponseDto;
import com.keybean.back_end_api.entity.User;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponseDto toDto (User user);

    @Mapping(target = "role", ignore = true)
    User createUser (UserCreateDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "role", ignore = true)
    void updatedUser (UserUpdateDto dto, User user);

}
