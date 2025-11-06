package com.keybean.creating_api2.Controller;

import com.keybean.creating_api2.dto.UserDTO;
import com.keybean.creating_api2.entity.User;
import com.keybean.creating_api2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    @ResponseBody
    public User getUserById (@PathVariable Long id) {
        return userService.getById(id);
    }


}
