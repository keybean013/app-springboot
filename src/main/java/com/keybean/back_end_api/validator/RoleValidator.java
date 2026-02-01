package com.keybean.back_end_api.validator;

import com.keybean.back_end_api.entity.Role;

import com.keybean.back_end_api.exception.BadRequestException;
import com.keybean.back_end_api.exception.ConflictException;
import com.keybean.back_end_api.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class RoleValidator {

    private final RoleRepository roleRepository;

    public Role.Status validateStatus (String status){

        try {
            return Role.Status.valueOf(status.toUpperCase());
        } catch (IllegalArgumentException ex) {
            throw new BadRequestException("Status must be INVALID, VALID, INACTIVE.");
        }

    }

    public void checkUniqueRoleName (String roleName) {

        if (roleRepository.existsByRoleNameAndDeletedAtIsNull(roleName)){
            throw new ConflictException("Role already exists.");
        }

    }

    public void checkUniqueRoleNameForUpdate (String roleName, Long id) {

        if (roleRepository.existsByRoleNameAndDeletedAtIsNullAndIdNot(roleName, id)) {
            throw new ConflictException("Role already exists.");
        }

    }

}
