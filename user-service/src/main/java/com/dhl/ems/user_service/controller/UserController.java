package com.dhl.ems.user_service.controller;

import com.dhl.ems.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String createUser(String username, String password, String email) {
        // Logic to create a user
        // This is a placeholder implementation
        return userService.createUser(username, password, email);
    }
}
