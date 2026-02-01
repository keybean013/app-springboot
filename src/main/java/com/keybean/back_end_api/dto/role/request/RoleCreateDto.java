package com.keybean.back_end_api.dto.role.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleCreateDto {

    private String roleName;

    private String status;

}
