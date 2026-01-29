package com.keybean.creating_api2.dto.user.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserActivateDto {

    // Adding this class
    @NotNull
    private Boolean isActive;

}
