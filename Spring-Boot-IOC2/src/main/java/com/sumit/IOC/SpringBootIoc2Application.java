package com.sumit.IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sumit.IOC.Student1.Student;
//import com.sumit.IOC.Student2.Student;



@SpringBootApplication
public class SpringBootIoc2Application {

	@Autowired
	private Student student1;
	
//	@Autowired
//	private Student student2;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoc2Application.class, args);
	}

}
