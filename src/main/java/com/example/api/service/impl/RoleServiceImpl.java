package com.example.api.service.impl;

import com.example.api.dto.role.request.RoleCreateDto;
import com.example.api.dto.role.request.RoleUpdateDto;
import com.example.api.dto.role.response.RoleResponseDto;
import com.example.api.entity.Role;
import com.example.api.exception.BadRequestException;
import com.example.api.exception.ConflictException;
import com.example.api.exception.NotFoundException;
import com.example.api.mapper.RoleMapper;
import com.example.api.repository.RoleRepository;
import com.example.api.service.RoleService;
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

    @Override
    public RoleResponseDto getRoleById(Long id) {
        Role role = roleRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(() -> new NotFoundException("Role not found"));
        return roleMapper.toDto(role);
    }

    @Override
    public List<RoleResponseDto> getAllRole() {
        return roleRepository.findAllByDeletedAtIsNull()
                .stream()
                .map(roleMapper::toDto).toList();
    }

    @Override
    public RoleResponseDto createRole(RoleCreateDto dto) {

        if (roleRepository.existsByRoleNameAndDeletedAtIsNull(dto.getRoleName())){
            throw new ConflictException("Role is already exist.");
        }

        if (dto.getRoleName() == null) {
            throw new BadRequestException("Role name can't be null");
        }

        Role role = roleMapper.toEntity(dto);

        Role entity = roleRepository.save(role);

        return roleMapper.toDto(entity);
    }

    @Override
    public void updateRole(RoleUpdateDto dto, Long id) {
        Role role = roleRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Role not found"));

        if (dto.getRoleName() != null &&
                roleRepository.existsByRoleNameAndDeletedAtIsNull(dto.getRoleName())) {
            throw new ConflictException("Role name already Exist.");
        }

        if (dto.getRoleName() == null) {
            throw new BadRequestException("Enter role name.");
        }

        //    ️ Validate enum
        Role.Status status = validateStatus(dto.getStatus());

        //      Map other fields (ignore nulls)
        roleMapper.updateEntity(dto, role);

        //      Set enum manually
        if (status != null) {
            role.setStatus(status);
        }

    }

    private Role.Status validateStatus(String status) {

        try {
            return Role.Status.valueOf(status.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new BadRequestException(
                    "Invalid status. Allowed values: VALID, INVALID, INACTIVE"
            );
        }

    }

    @Override
    public void deleteRole(Long id) {

        Role role = roleRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(() -> new NotFoundException("Role not found"));

        role.softDelete();

        roleRepository.save(role);

    }
}
