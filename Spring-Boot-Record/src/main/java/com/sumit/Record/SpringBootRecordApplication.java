package com.sumit.Record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties1.class)
public class SpringBootRecordApplication  implements ApplicationRunner{
	@Autowired
	ConfigProperties1 object;
    

	public static void main(String[] args) {
		
		
       
		
		SpringApplication.run(SpringBootRecordApplication.class, args);
		
		
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(object.data());
		
	}
}
