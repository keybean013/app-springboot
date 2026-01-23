package com.keybean.creating_api2.service.implementation;

import com.keybean.creating_api2.dto.auth.response.AuthResponseDto;
import com.keybean.creating_api2.entity.User;
import com.keybean.creating_api2.repository.UserRepository;
import com.keybean.creating_api2.service.AuthService;
import jakarta.transaction.Transactional;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import com.keybean.creating_api2.utils.JwtUtil;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class AuthServiceImpl implements AuthService {


    private final JwtUtil jwtUtil;
    private final UserRepository userRepository;

    public AuthServiceImpl(UserDetailsServiceImpl userDetailsServiceImpl, JwtUtil jwtUtil, UserRepository userRepository) {
        this.jwtUtil = jwtUtil;
        this.userRepository = userRepository;
    }

    @Override
    public AuthResponseDto getUserInfoDto(Authentication authentication) {

        String token = jwtUtil.generateToken((UserDetails) authentication.getPrincipal());
        User user = userRepository.findByUsername(authentication.getName())
                .orElseThrow(() -> new IllegalStateException("Authenticated user not found"));

        AuthResponseDto responseDto  = new AuthResponseDto();

        responseDto.setSessionKey(token);
        responseDto.setUsername(user.getUsername());
        responseDto.setId(user.getId());

        return responseDto;
    }
}
