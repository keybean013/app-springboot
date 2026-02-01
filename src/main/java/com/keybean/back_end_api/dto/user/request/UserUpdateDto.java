package com.keybean.back_end_api.dto.user.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserUpdateDto {

    @Size(min = 8, max = 30, message = "Password must contain 8 to 30 characters.")
    private String password;

    private String firstName;

    private String lastName;

    @Pattern(
            regexp = "^.*@.*\\..*$",
            message = "Invalid email format."
    )
    @Email(message = "Invalid email format.")
    private String email;

    private String address;

    @Pattern(
            regexp = "^(\\+63|63|0)(9\\d{9}|\\d{9,10})$",
            message = "Invalid Philippine contact number"
    )
    private String contactNo;


}
