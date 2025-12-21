package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    // THIS WILL NOW MAP TO "/"
    @GetMapping("/")
    public String root() {
        return "OK";
    }

    // This will map to "/register"
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }
}
