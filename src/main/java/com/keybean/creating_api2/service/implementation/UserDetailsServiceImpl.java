package com.keybean.creating_api2.service.implementation;

import com.keybean.creating_api2.entity.User;
import com.keybean.creating_api2.repository.UserRepository;
import com.keybean.creating_api2.security.SecurityUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements org.springframework.security.core.userdetails.UserDetailsService {
    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

            User user = userRepository.findByUsernameWithRoles(username)
                    .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new SecurityUser(user);

    }
}
