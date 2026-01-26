package com.keybean.creating_api2.dto.user.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateDto {


    @Size(max = 20, message = "Username must be at most 20 characters")
    private String username;

    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;

    private String firstName;
    private String lastName;

    @Pattern(regexp = "\\d{11}", message = "Contact number must be exactly 11 digits")
    private String contactNo;

    private String address;

    @Email(message = "Email should be valid")
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@example\\.com$",
            message = "Email must be from example.com domain")
    private String email;

    private Boolean isActive;

    private Long roleId; // Optional: only update if provided
}
