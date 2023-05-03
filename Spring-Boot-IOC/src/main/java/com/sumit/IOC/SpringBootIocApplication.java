package com.sumit.IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sumit.IOC.DI.Student;

@SpringBootApplication
public class SpringBootIocApplication  implements ApplicationRunner{
	
	@Autowired
	private Student student;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIocApplication.class, args);
		
		
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
          student.cheating();
	}

}
