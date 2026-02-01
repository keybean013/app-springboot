package com.keybean.back_end_api.service.implementation;


import com.keybean.back_end_api.dto.role.request.RoleCreateDto;
import com.keybean.back_end_api.dto.role.request.RoleUpdateDto;
import com.keybean.back_end_api.dto.role.response.RoleResponseDto;
import com.keybean.back_end_api.entity.Role;
import com.keybean.back_end_api.exception.BadRequestException;
import com.keybean.back_end_api.exception.NotFoundException;
import com.keybean.back_end_api.mapper.RoleMapper;
import com.keybean.back_end_api.repository.RoleRepository;
import com.keybean.back_end_api.service.RoleService;
import com.keybean.back_end_api.validator.RoleValidator;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;
    private final RoleValidator roleValidator;


    @Override
    public List<RoleResponseDto> getAllRoles() {

        return roleRepository.findAllByDeletedAtIsNull()
                .stream()
                .map(roleMapper::toDto)
                .toList();
    }

    @Override
    public RoleResponseDto getRoleById(Long id) {
        Role role  = roleRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(()-> new NotFoundException("Role not found."));

        return roleMapper.toDto(role);
    }

    @Override
    public RoleResponseDto createRole(RoleCreateDto dto) {

        if (dto.getRoleName() == null) {
            throw new BadRequestException("Role name Can't be null.");
        }

        roleValidator.checkUniqueRoleName(dto.getRoleName());

        Role role = roleMapper.createRole(dto);

        if (dto.getStatus() != null) {
            role.setStatus(
                    roleValidator.validateStatus(dto.getStatus())
            );

        }

        Role createdRole = roleRepository.save(role);

        return  roleMapper.toDto(createdRole);

    }

    @Override
    public void updateRole(RoleUpdateDto dto, Long id) {

        Role role = roleRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(() -> new NotFoundException("Role not found"));

        if (dto.getRoleName() != null) {
            roleValidator.checkUniqueRoleNameForUpdate(
                    dto.getRoleName(), id
            );
        }

        roleMapper.updateRole(dto, role);

        if (dto.getStatus() != null){

            role.setStatus(
                    roleValidator.validateStatus(dto.getStatus())
            );
        }

        roleRepository.save(role);

    }

    @Override
    public void deleteRole(Long id) {

    }
}
