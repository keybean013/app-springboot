package com.keybean.creating_api2.dto.request;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleUpdateRequestDto {

    @NotBlank(message = "Role name is required.")
    private String roleName;
    private String status;
}
