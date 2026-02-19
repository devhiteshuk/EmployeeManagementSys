package com.dhl.ems.user_service.service.impl;

import com.dhl.ems.user_service.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public String createUser(String username, String password, String email) {
        return String.format("User created with username: %s, email: %s", username, email);
    }
}
