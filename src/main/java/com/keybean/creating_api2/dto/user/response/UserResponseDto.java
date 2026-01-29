package com.keybean.creating_api2.dto.user.response;


import com.keybean.creating_api2.dto.role.response.RoleResponseDto;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponseDto {

    private Long id;
    private String publicId;
    private RoleResponseDto role;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String contactNo;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;
}
