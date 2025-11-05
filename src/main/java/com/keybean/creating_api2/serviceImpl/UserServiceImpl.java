package com.keybean.creating_api2.serviceImpl;

import com.keybean.creating_api2.entity.User;
import com.keybean.creating_api2.repository.UserRepository;
import com.keybean.creating_api2.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

}
