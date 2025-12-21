package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // ✅ default constructor
    public UserServiceImpl() {
    }

    // ✅ parameterized constructor (dummy – for professor requirement)
    public UserServiceImpl(String dummy) {
    }

    @Override
    public User register(User user) {
        return user;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>();
    }
}
