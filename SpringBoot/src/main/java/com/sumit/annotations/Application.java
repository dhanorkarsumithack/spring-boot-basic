package com.sumit.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sumit.mypack.Dog;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	@Qualifier("student2")
	private Student student;
	
	@Autowired
	private Emp employee;
	@Autowired
	private Dog dog;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		student.studying();
		employee.whatsYourName();
		dog.eating();
	}

}
