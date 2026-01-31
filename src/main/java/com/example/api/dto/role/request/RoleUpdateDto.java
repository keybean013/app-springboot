package com.example.api.dto.role.request;

import com.example.api.entity.Role;
import com.example.api.enums.role.EnumValue;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleUpdateDto {

    public String roleName;

    private String status;

}
