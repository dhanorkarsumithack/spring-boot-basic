package com.sumit.IOC.Student1;

import org.springframework.stereotype.Component;

@Component
public class Student {
	String username;
	String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
