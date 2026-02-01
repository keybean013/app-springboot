package com.keybean.back_end_api.dto.user.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCreateDto {

    @NotBlank(message = "Role name is required")
    private String roleName;

    @Size(min = 5, max = 15, message = "Username must contain 5 to 15 characters.")
    @NotBlank(message = "Username is required")
    private String username;

    @Size(min = 8, max = 30, message = "Password must contain 8 to 30 characters.")
    @NotBlank(message = "Password is required")
    private String password;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;


    @Pattern(
            regexp = "^.*@.*\\..*$",
            message = "Invalid email format"
    )
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format.")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    @Pattern(
            regexp = "^(\\+63|63|0)(9\\d{9}|\\d{9,10})$",
            message = "Invalid Philippine contact number"
    )
    @NotBlank(message = "Contact No. is required")
    private String contactNo;

}
