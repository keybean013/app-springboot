package com.keybean.creating_api2.dto.user.response;

import com.keybean.creating_api2.dto.role.response.RoleResponseDto;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {

    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String address;
    private String contactNo;
    private String email;
    private boolean active;
    private String sessionKey;
    private String roleName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
