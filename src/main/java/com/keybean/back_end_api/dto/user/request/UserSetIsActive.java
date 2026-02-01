package com.keybean.back_end_api.dto.user.request;


import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserSetIsActive {

    @NotNull(message = "Active status must be true or false.")
    public Boolean isActive;
}
