package com.example.api.dto.user.response;

import com.example.api.dto.role.response.RoleResponseDto;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    private boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
