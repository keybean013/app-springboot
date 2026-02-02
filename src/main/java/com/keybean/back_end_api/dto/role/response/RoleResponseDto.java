package com.keybean.back_end_api.dto.role.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleResponseDto {

    private String publicId;
    private String roleName;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
