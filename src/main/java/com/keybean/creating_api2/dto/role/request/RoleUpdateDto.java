package com.keybean.creating_api2.dto.role.request;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleUpdateDto {

    @Size(max = 50, message = "Role name must be at most 50 characters")
    private String roleName;

    @Pattern(regexp = "ACTIVE|INACTIVE|INVALID", message = "Status must be ACTIVE, INACTIVE, or INVALID")
    private String status;

}
