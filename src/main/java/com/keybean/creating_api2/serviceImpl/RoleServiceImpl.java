package com.keybean.creating_api2.serviceImpl;

import com.keybean.creating_api2.dto.RoleDTO;
import com.keybean.creating_api2.entity.Role;
import com.keybean.creating_api2.repository.RoleRepository;
import com.keybean.creating_api2.service.RoleService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

  @Autowired
  RoleRepository roleRepository;

  @Override
  public List<RoleDTO> getAllRoles() {

    List<Role> rows = roleRepository.getAllRoles();

    if (rows == null || rows.isEmpty()) return null; // Handle empty record set

    List<RoleDTO> roles = new ArrayList<>();

    for (Role row : rows) {

      Long roleId = row.getId();
      String roleName = row.getRoleName();
      String roleStatus = row.getStatus();
      String roleCreated = row.getCreated();
      String roleUpdated = row.getUpdated();

      RoleDTO role = new RoleDTO();
      role.setId( roleId );
      role.setRoleName( roleName );
      role.setStatus( roleStatus );
      role.setCreated( roleCreated );
      role.setUpdated( roleUpdated );

      roles.add( role );
    }

    return roles;

  }

  @Override
  public RoleDTO getRoleById(Long id) {

    Role role = roleRepository.getRoleById( id );

    if (role == null) return null; // Handle not found

    RoleDTO roleDTO = new RoleDTO();
    roleDTO.setId(role.getId());
    roleDTO.setRoleName(role.getRoleName());
    roleDTO.setStatus(role.getStatus());
    roleDTO.setCreated(role.getCreated());
    roleDTO.setUpdated(role.getUpdated());

    return roleDTO;
  }
}
