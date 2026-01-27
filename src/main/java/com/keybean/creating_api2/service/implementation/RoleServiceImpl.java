package com.keybean.creating_api2.service.implementation;

import com.keybean.creating_api2.dto.role.request.RoleUpdateDto;
import com.keybean.creating_api2.dto.role.response.RoleResponseDto;
import com.keybean.creating_api2.entity.Role;
import com.keybean.creating_api2.mapper.RoleMapper;
import com.keybean.creating_api2.repository.RoleRepository;
import com.keybean.creating_api2.service.RoleService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {


    @Override
    public RoleResponseDto createRole(RoleUpdateDto dto) {
        return null;
    }

    @Override
    public RoleResponseDto getRoleById(Long id) {
        return null;
    }

    @Override
    public List<RoleResponseDto> getAllRoles() {
        return List.of();
    }

    @Override
    public RoleResponseDto updateRole(Long id, RoleUpdateDto dto) {
        return null;
    }

    @Override
    public RoleResponseDto patchRole(Long id, RoleUpdateDto dto) {
        return null;
    }

    @Override
    public void deleteRole(Long id) {

    }
}
