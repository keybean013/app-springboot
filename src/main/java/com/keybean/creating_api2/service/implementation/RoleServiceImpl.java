package com.keybean.creating_api2.service.implementation;

import com.keybean.creating_api2.dto.role.request.RoleCreateDto;
import com.keybean.creating_api2.dto.role.request.RoleUpdateDto;
import com.keybean.creating_api2.dto.role.response.RoleResponseDto;
import com.keybean.creating_api2.entity.Role;
import com.keybean.creating_api2.repository.RoleRepository;
import com.keybean.creating_api2.service.RoleService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<RoleResponseDto> getAllRoles () {
        return roleRepository.findAllRoles();
    }

    @Override
    public Optional<RoleResponseDto> getRoleById(Long id) {
        return roleRepository.findRoleById(id);
    }

    @Override
    public void createRole(RoleCreateDto dto) {
        Role role = new Role();

        role.setRoleName(dto.getRoleName());

        roleRepository.save(role);

    }

    @Override
    public void updatedDto(RoleUpdateDto dto, Long id) {
        Role role = roleRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Role not found"));

        role.setRoleName(dto.getRoleName());
        role.setStatus(dto.getStatus());
    }

    @Override
    public void deleteRole(Long id) {

    }
}
