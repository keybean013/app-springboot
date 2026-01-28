package com.keybean.creating_api2.dto.user.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCreateDto {

    private String roleName;

    @NotBlank(message = "Username is required")
    @Size(min = 10, max = 20, message = "Password must contain 10 to 20 characters")
    private String username;

    @NotBlank(message = "Password is required")
    @Size(min = 15, max = 30, message = "Password must contain 15 to 30 characters")
    private String password;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @Email
    @Pattern( regexp = "^[A-Za-z0-9._%+-]+@gmail\\.com$",
            message = "Email must be from gmail.com domain")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "address is required")
    private String address;

    @Pattern(regexp = "\\d{11}", message = "Contact number must be exactly 11 digits")
    @NotBlank(message = "Contact No. is required")
    private String contactNo;

}
