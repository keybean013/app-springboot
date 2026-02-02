package com.keybean.back_end_api.dto.user.response;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponseDto {

    private String publicId;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String contactNo;
    private Boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
