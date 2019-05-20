package com.java.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.java.application.domain.LoggedInUser;
import com.java.application.domain.User;

@Service
public class LoggedInUserDetailsService implements UserDetailsService {

    private final UserService userService;

    @Autowired
    public LoggedInUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    public LoggedInUser loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByUsername(username);
        return new LoggedInUser(user);
    }
}
