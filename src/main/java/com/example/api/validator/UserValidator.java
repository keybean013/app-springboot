package com.example.api.validator;


import com.example.api.exception.ConflictException;
import com.example.api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Component
public class UserValidator {

    private final UserRepository userRepository;

    public void checkUniqueEmail (String email) {
        if (userRepository.existsByEmailAndDeletedAtIsNull(email)) {
            throw new ConflictException("Email is already exists.");
        }
    }

    public void checkUniqueUsername (String username) {
        if (userRepository.existsByUsernameAndDeletedAtIsNull(username)){
            throw new ConflictException("Username is already exists.");
        }
    }

    public void checkUniqueFullName (String firstName, String lastName) {
        if (userRepository.existsByFirstNameAndLastNameAndDeletedAtIsNull(firstName, lastName)){
            throw new ConflictException("Full name exists.");
        }
    }
}
