package com.java.application.domain;

import org.springframework.security.core.authority.AuthorityUtils;

public class LoggedInUser extends org.springframework.security.core.userdetails.User {
	private static final long serialVersionUID = 1L;
	private User user;

	public LoggedInUser(User user) {
		super(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()));
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public UserRole getRole() {
		return user.getRole();
	}
}