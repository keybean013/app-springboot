package com.example.api.dto.user.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.lang.reflect.Member;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSetIsActive {

    @NotNull(message = "Input active status must be true or false")
    private Boolean isActive;
}
