package com.keybean.back_end_api.dto.role.request;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleUpdateDto {

    private String roleName;

    private String status;

}
