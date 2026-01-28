package com.keybean.creating_api2.dto.user.request;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserUpdateDto {

    private String roleName;


    private String username;


    private String password;


    private String firstName;


    private String lastname;


    private String email;


    private String address;


    private String contactNo;

    private Boolean isActive;

}
