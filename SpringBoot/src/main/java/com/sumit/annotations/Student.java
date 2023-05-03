package com.sumit.annotations;

public class Student {
	
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void studying() {
		System.out.println(name+" is studying ...");
	}
}
