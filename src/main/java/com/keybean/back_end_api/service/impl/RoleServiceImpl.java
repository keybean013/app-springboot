package com.keybean.back_end_api.service.impl;

import com.keybean.back_end_api.dto.role.request.RoleCreateRequestDto;
import com.keybean.back_end_api.dto.role.request.RoleUpdateRequestDto;
import com.keybean.back_end_api.dto.role.response.RoleResponseDto;
import com.keybean.back_end_api.entity.Role;
import com.keybean.back_end_api.exception.ConflictException;
import com.keybean.back_end_api.exception.NotFoundException;
import com.keybean.back_end_api.mapper.RoleMapper;
import com.keybean.back_end_api.repository.RoleRepository;
import com.keybean.back_end_api.service.RoleService;
import com.keybean.back_end_api.validator.RoleValidator;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
                .map(roleMapper::toDto).toList();

    }

    @Override
    public RoleResponseDto getRoleById(Long id) {

        Role role =  roleRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(() -> new NotFoundException("Role not found."));

        return roleMapper.toDto(role);
    }

    @Override
    public RoleResponseDto createdRole(RoleCreateRequestDto dto) {

        if (dto.getRoleName() != null) {
            roleValidator.CheckUniqueRoleName(dto.getRoleName());
        }

        Role role = roleMapper.create(dto);

        if (dto.getStatus() != null ){
            role.setStatus(roleValidator.validateStatus(dto.getStatus()));
        }

        Role roleSaved = roleRepository.save(role);

        return roleMapper.toDto(roleSaved);
    }

    @Override
    public void updateRole(RoleUpdateRequestDto dto, Long id) {
        Role role = roleRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(() -> new NotFoundException("Role not found."));

        if (dto.getRoleName() != null && dto.getRoleName().equals(role.getRoleName())) {
            throw new ConflictException("You didn't change anything. You write same ROLE as old one.");
        }

        roleMapper.update(dto, role);

        if (dto.getStatus() != null
                && !role.getStatus().name().equalsIgnoreCase(dto.getStatus())) {
            role.setStatus(roleValidator.validateStatus(dto.getStatus()));
        }

//        if (dto.getStatus() != null && role.getStatus().name().equalsIgnoreCase(dto.getStatus())) {
//            throw new ConflictException("You didn't change anything. You write same STATUS as old one.");
//        }
//
//        if (dto.getStatus() != null) {
//            role.setStatus(roleValidator.validateStatus(dto.getStatus()));
//        }

        roleRepository.save(role);

    }

    @Override
    public void deleteRole(Long id) {

        Role role = roleRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(() -> new NotFoundException("Role not found"));

        role.softDelete();

        roleRepository.save(role);

    }
}
