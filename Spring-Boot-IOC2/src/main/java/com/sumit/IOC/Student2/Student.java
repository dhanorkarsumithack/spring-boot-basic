package com.sumit.IOC.Student2;

import org.springframework.stereotype.Component;

@Component
public class Student {
	String username;
	String email;
	String mob;
	
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
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
