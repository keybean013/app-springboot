package com.keybean.back_end_api.dto.user.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserActiveStatusRequestDto {

    @NotBlank(message = "Active status is required.")
    private Boolean isActive;
}
