package com.keybean.back_end_api.dto.role.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleCreateRequestDto {

    @NotBlank(message = "Role name is required.")
    private String roleName;
    private String status;

}
