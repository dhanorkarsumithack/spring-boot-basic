package com.sumit.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.sumit.mypack"})
public class MyConfig {
	

	@Bean("student1")
	public Student getStudent() {
		System.out.println("creating student object..");
		return new Student("student1");
	}
	
	@Bean("student2")
	public Student createStudent() {
		System.out.println("creating second student object");
		return new Student("student2");
	}
}


