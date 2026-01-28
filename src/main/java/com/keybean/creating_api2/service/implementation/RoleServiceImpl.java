package com.keybean.creating_api2.service.implementation;

import com.keybean.creating_api2.dto.role.request.RoleCreateRequestDto;
import com.keybean.creating_api2.dto.role.request.RoleUpdateRequestDto;
import com.keybean.creating_api2.dto.role.response.RoleResponseDto;
import com.keybean.creating_api2.entity.Role;
import com.keybean.creating_api2.mapper.RoleMapper;
import com.keybean.creating_api2.repository.RoleRepository;
import com.keybean.creating_api2.service.RoleService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    @Override
    public List<RoleResponseDto> getAllRoles() {
        return roleRepository.findAllByDeletedAtIsNull()
                .stream()
                .map(roleMapper::toDto).toList();
    }

    @Override
    public Optional<RoleResponseDto> getRoleById(Long id) {
        return roleRepository.findByIdAndDeletedAtIsNull(id)
                .map(roleMapper::toDto);
    }

    @Override
    public RoleResponseDto createRole(RoleCreateRequestDto dto) {
        Role role = roleMapper.createRole(dto);

        Role saved = roleRepository.save(role);

        return roleMapper.toDto(saved);
    }

    @Override
    public String updateRole(RoleUpdateRequestDto dto, Long id) {
        Role role = roleRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(()->new RuntimeException("Role not found"));

        roleMapper.updateRole(dto, role);

        return "Role updated Successfully.";
    }

    @Override
    public String deleteRole(Long id) {

        Role role = roleRepository.findByIdAndDeletedAtIsNull(id)
                .orElseThrow(()->new RuntimeException("Role not found"));

        role.softDelete();

        roleRepository.save(role);

        return "Role Deleted Successfully.";
    }
}
