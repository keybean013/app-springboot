package com.keybean.creating_api2.serviceImpl;

import com.keybean.creating_api2.entity.User;
import com.keybean.creating_api2.repository.UserRepository;
import com.keybean.creating_api2.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
// What is the meaning of "implements" after the "UserServiceImpl"?
// I guess this class is for implementation of UserService.
// Confusing coz I didn't even use the "UserService" here.
public class UserServiceImpl implements UserService {

    // What is purpose of "Autowired" annotation?
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
