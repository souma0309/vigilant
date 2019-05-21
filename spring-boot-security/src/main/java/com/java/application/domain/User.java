package com.java.application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "USERS")
public class User {	
	
	@Id
	@Column(name = "USERNAME", nullable = false, unique = true)
	private String username;
	@Column(name = "PASSWORD", nullable = false)
	@NotNull
	private String password;
	@Column(name = "ACTIVE", nullable = false)
    @NotNull
    private Boolean active;
	
	@Column(name = "ROLE", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRole getRole() {
        return userRole;
    }

    public void setRole(UserRole userRole) {
        this.userRole = userRole;
    }
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public UserRole getUserRole() {
		return userRole;
	}
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
    
    
}