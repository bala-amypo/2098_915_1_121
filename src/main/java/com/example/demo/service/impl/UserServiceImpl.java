package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl() {}

    public UserServiceImpl(UserRepository userRepository,
                           BCryptPasswordEncoder encoder) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(User user) {
        return user;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository == null
                ? Optional.empty()
                : userRepository.findByEmail(email);
    }
}
