package com.example.api.dto.role.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleCreateDto {

    @NotBlank(message = "Role name is required.")
    private String roleName;
    private String Status;

}
