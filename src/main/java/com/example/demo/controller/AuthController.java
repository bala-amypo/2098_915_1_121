package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    // Constructor
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    // Register user (NO SECURITY, SIMPLE SAVE)
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.save(user);   // ✅ FIX IS HERE
    }
}
