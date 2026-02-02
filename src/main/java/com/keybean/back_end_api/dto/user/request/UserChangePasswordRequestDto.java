package com.keybean.back_end_api.dto.user.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserChangePasswordRequestDto {

    private String OldPassword;

    @Size(min = 8, max = 30, message = "Password must contain 8 to 30 characters.")
    @NotBlank(message = "Password is required")
    private String password;

}
