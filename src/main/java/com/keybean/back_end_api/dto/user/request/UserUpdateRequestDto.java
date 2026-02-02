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
public class UserUpdateRequestDto {


    private String roleName;

    @Size(min = 5, max = 15, message = "Username must contain 5 to 15 characters.")
    @NotBlank(message = "Username is required")
    private String username;
    private String firstName;
    private String lastName;
    private String address;

    @Pattern(
            regexp = "^.*@.*\\..*$",
            message = "Invalid email format"
    )
    @Email(message = "Invalid email format.")
    private String email;

    @Pattern(
            regexp = "^(\\+63|63|0)(9\\d{9}|\\d{9,10})$",
            message = "Invalid Philippine contact number"
    )
    private String contactNo;
    private Boolean isActive;

}
