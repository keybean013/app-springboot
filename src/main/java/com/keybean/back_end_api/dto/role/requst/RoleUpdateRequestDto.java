package com.keybean.back_end_api.dto.role.requst;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleUpdateRequestDto {

    private String roleName;
    private String status;
}
