package com.keybean.api_practice.controllers;

import com.keybean.api_practice.entity.User;
import com.keybean.api_practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private String test = "test";

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    @ResponseBody
    public User getUserById (@PathVariable Long id) {
        return userService.getById(id);
    }

  // setting the value of variable appName
  @Value("${spring.application.name}")
  private String appName;


    // End point or path
  // getter method that will return the appName
  @GetMapping("/app/name")
  private String getAppName() {
    return appName;
  }

}
