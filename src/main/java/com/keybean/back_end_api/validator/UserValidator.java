package com.keybean.back_end_api.validator;

import com.keybean.back_end_api.exception.BadRequestException;
import com.keybean.back_end_api.exception.ConflictException;
import com.keybean.back_end_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserValidator {

    private final UserRepository userRepository;

    public void checkUniqueUsername (String username) {

        if (userRepository.existsByUsernameAndDeletedAtIsNull(username)) {
            throw new ConflictException("Username already exists.");
        }

    }

    public void checkUniqueEmail (String email) {

        if (userRepository.existsByEmailAndDeletedAtIsNull(email)) {
            throw new ConflictException("Email already exists.");
        }

    }

    public void checkUniqueFullName (String firstName, String lastName) {

        if (userRepository.existsByFirstNameAndLastNameAndDeletedAtIsNull(firstName, lastName)) {
            throw new ConflictException("Full name already exists.");
        }

    }

    public void isActivateValidator (Boolean isActive) {
        if ( isActive != null && !isActive || Boolean.TRUE.equals(isActive)) {
            throw new BadRequestException("Is active must be true or false.");
        }
    }

}
