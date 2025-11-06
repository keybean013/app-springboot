package com.keybean.creating_api2.serviceImpl;

import com.keybean.creating_api2.dto.RoleDTO;
import com.keybean.creating_api2.dto.UserDTO;
import com.keybean.creating_api2.entity.User;
import com.keybean.creating_api2.repository.UserRepository;
import com.keybean.creating_api2.service.RoleService;
import com.keybean.creating_api2.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleService roleService;

    @Override
    public UserDTO getUserById(Long id) {

        User user = userRepository.getUserById( id );

        if(user == null) return null; // validation

        UserDTO userDTO = new UserDTO();
        userDTO.setUserId( user.getId() );
        userDTO.setUserName( user.getUsername() );
        userDTO.setUserFirstName( user.getFirstName() );
        userDTO.setUserLastName( user.getLastName() );
        userDTO.setUserSessionKey( user.getSessionKey() );

        Long roleId = user.getRole().getId();

        RoleDTO roleDTO = roleService.getRoleById( roleId );

        userDTO.setUserRole( roleDTO );

        return userDTO;

    }

    @Override
    public List<UserDTO> getAllUsers() {

        List<User> users = userRepository.getAllUsers(); // galing sa database

        if(users == null || users.isEmpty()) return null; // handle empty object

        List<UserDTO> userDTOList = new ArrayList<>();

        for(User user : users){
            Long userId = user.getId();
            UserDTO userDTO = getUserById(userId);
            userDTOList.add( userDTO );
        }


        return userDTOList;
    }
}
