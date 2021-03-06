package com.haywood.dog.forms;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginForm {
	
	@NotEmpty(message="Username is required")
    private String username;
	
	@NotEmpty(message="Password is required")
	private String password;

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

	@Override
	public String toString() {
		return "LoginForm [username=" + username + ", password=" + password
				+ "]";
	}
	
	
}
