package com.keybean.back_end_api.mapper;

import com.keybean.back_end_api.dto.user.request.UserCreateRequestDto;
import com.keybean.back_end_api.dto.user.request.UserUpdateRequestDto;
import com.keybean.back_end_api.dto.user.response.UserResponseDto;
import com.keybean.back_end_api.entity.User;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponseDto toDto (User user);

    @Mapping(target = "role", ignore = true)
    User create (UserCreateRequestDto dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "role", ignore = true)
    void update (UserUpdateRequestDto dto, @MappingTarget User user);
}
