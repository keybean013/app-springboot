package com.keybean.creating_api2.serviceImpl;

import com.keybean.creating_api2.dto.RoleDTO;
import com.keybean.creating_api2.entity.Role;
import com.keybean.creating_api2.repository.RoleRepository;
import com.keybean.creating_api2.service.RoleService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public RoleDTO getRoleById(Long id) {
        Role role  = roleRepository.getRoleById(id);

        if (role == null) return null;

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId(role.getId());
        roleDTO.setRoleName(role.getRoleName());
        roleDTO.setRoleStatus(role.getStatus());
        roleDTO.setRoleCreated(role.getCreated());
        roleDTO.setRoleUpdated(role.getUpdated());

        return roleDTO;
    }
}

