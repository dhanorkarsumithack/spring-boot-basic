package com.sumit.IOC.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private String name;

	//	public void setName(String name) {
	//		this.name = name;
	//	}
	
	//	public void display() {
	//		System.out.println("Student name is "+name);
	//	}
	//
	//	public Student(String name) {
	//		this.name = name;
	//	}
    
	@Autowired
	MathCheat mathCheat;
	public void cheating() {
		mathCheat.mathCheat();
	}
}
