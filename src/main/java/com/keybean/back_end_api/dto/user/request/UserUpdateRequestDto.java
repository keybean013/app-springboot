package com.keybean.back_end_api.dto.user.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserUpdateRequestDto {

    @Size(min = 5, max = 15, message = "Username must contain 5 to 15 characters.")
    @NotBlank(message = "Username is required")
    private String username;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String contactNo;

}
