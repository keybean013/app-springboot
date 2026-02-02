package com.keybean.back_end_api.dto.role.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleStatusRequestDto {

    @NotBlank(message = "Status is required.")
    private String status;


}
