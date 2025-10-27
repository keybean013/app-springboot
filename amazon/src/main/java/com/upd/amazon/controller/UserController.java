package com.upd.amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.upd.amazon.entity.User;
import com.upd.amazon.service.UserService;

@RestController
public class UserController {

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    @ResponseBody
    public User getUserById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping("/users")
    @ResponseBody
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/active")
    @ResponseBody
    public List<User> getAllActiveUsers() {
        return userService.getAllActiveUsers();
    }


    //  testing

    @GetMapping("/user/test")
    public String test() {
        String viewName = getViewName();
        return viewName;
    }

    private String getViewName() {
        System.out.println(appName);
        return appName;
    }


}

