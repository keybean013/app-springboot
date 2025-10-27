package com.upd.amazon.service;

import java.util.List;

import com.upd.amazon.entity.User;

public interface UserService {

    User getById(Long id);

    List<User> getAllUsers();

    List<User> getAllActiveUsers();

} 
