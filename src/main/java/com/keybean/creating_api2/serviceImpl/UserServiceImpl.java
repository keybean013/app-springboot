package com.keybean.creating_api2.serviceImpl;

import com.keybean.creating_api2.dto.RoleDTO;
import com.keybean.creating_api2.dto.UserDTO;
import com.keybean.creating_api2.entity.Role;
import com.keybean.creating_api2.entity.User;
import com.keybean.creating_api2.repository.UserRepository;
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

    @Override
    public User getById(Long id) {
        return userRepository.getUserById( id );
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> rows = userRepository.findAllUsersWithRolesRaw();
        List<UserDTO> users = new ArrayList<>();

        for (User row : rows) {
            Long userId = row.getId();
            String username = row.getUsername();
            String firstname = row.getFirstName();
            String lastname = row.getLastName();
            Long roleId = row.getRole().getId();
            String sessionkey = row.getSessionKey();
            String rolename = row.getRole().getRoleName();


            // Build Role object manually
            RoleDTO role = new RoleDTO();
//            reuse code

            // Build User object manually
            UserDTO user = new UserDTO();
            user.setId( userId );
            user.setFirst_name( firstname );
            user.setLast_name( lastname );
            user.setRole_name( rolename );
            user.setSession_key( sessionkey );
            user.setRole( role );

            users.add(user);
        }

        return users;
    }

}
