package com.keybean.api_practice.serviceImpl;

import com.keybean.api_practice.entity.User;
import com.keybean.api_practice.repository.UserRepository;
import com.keybean.api_practice.service.UserService;
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
