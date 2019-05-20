package com.java.application.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.application.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
