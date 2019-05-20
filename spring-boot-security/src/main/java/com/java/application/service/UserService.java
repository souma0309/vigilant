package com.java.application.service;

import com.java.application.domain.User;

public interface UserService {
    User getUserByUsername(String username);  
}