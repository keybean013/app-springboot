package com.keybean.creating_api2.service;

import com.keybean.creating_api2.dto.auth.response.AuthResponseDto;
import org.springframework.security.core.Authentication;

public interface AuthService {

    AuthResponseDto getUserInfoDto(Authentication authentication);

}
