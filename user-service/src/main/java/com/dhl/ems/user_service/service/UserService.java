package com.dhl.ems.user_service.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    String createUser(String username, String password, String email);
}
