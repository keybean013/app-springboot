package com.example.api.dto.user.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserUpdateDto {

    private String roleName;

    @Size(min = 5, max = 15, message = "Username must contain 5 to 15 characters.")
    private String username;

    @Size(min = 8, max = 30, message = "Password must contain 8 to 30 characters.")
    private String password;

    private String firstName;

    private String lastName;

    @Pattern(
            regexp = "^.*@.*\\..*$",
            message = "Invalid email format"
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
