package com.keybean.creating_api2.dto.user.request;

import com.keybean.creating_api2.dto.role.response.RoleResponseDto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCreateDto {

    private String roleName;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String contactNo;
}
