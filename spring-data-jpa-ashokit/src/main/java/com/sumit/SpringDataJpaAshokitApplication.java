package com.sumit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sumit.Repository.ContactMasterRepo;
import com.sumit.entity.ContactMasterEntity;

@SpringBootApplication
public class SpringDataJpaAshokitApplication {

   
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaAshokitApplication.class, args);	
	}

	


	
}
