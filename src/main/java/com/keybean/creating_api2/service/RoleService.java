package com.keybean.creating_api2.service;


import com.keybean.creating_api2.dto.RoleDTO;

import java.util.List;

public interface RoleService {

  RoleDTO getRoleById(Long id);

  List<RoleDTO> getAllRoles();

}
