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
  public RoleDTO getRoleById(Long id) {

    Role role = roleRepository.getRoleById( id );

    if(role == null) return null; //handle not found

    RoleDTO roleDTO = new RoleDTO(); // instantiate

    roleDTO.setRoleId( role.getId() );
    roleDTO.setRoleName( role.getRoleName() );
    roleDTO.setRoleStatus( role.getStatus() );
    roleDTO.setRoleCreated( role.getCreated() );
    roleDTO.setRoleUpdated( role.getUpdated() );

    return roleDTO;
  }

  @Override
  public List<RoleDTO> getAllRoles() {

    List<Role> roles =roleRepository.getAllRoles(); // galing sa database

    if(roles == null || roles.isEmpty()) return null; // handle empty object

    List<RoleDTO> roleDTOList = new ArrayList<>();

    for(Role role : roles){
      Long roleId = role.getId();
      RoleDTO roleDTO = getRoleById(roleId); // reuse
      roleDTOList.add( roleDTO );
    }

    return roleDTOList;
  }

}
