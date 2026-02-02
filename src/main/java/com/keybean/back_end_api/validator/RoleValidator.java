package com.keybean.back_end_api.validator;

import com.keybean.back_end_api.entity.Role;
import com.keybean.back_end_api.exception.BadRequestException;
import com.keybean.back_end_api.exception.ConflictException;
import com.keybean.back_end_api.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RoleValidator {

    private final RoleRepository roleRepository;

    public void CheckUniqueRoleName (String roleName) {

        if (roleRepository.existsByRoleNameAndDeletedAtIsNull(roleName)) {
            throw new ConflictException("Role already exists.");
        }

    }

    public Role.Status validateStatus (String status) {

        try {
            return Role.Status.valueOf(status.toUpperCase());
        } catch (IllegalArgumentException ex) {
            throw new BadRequestException("Status must be VALID, INVALID, INACTIVE.");
        }

    }

}
