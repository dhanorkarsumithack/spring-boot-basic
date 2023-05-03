package com.sumit.annotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.annotations.Student;

@RestController
public class MyController {
	
	
	@Autowired
	@Qualifier("student1")
	private Student student;

	@RequestMapping(value="/home",method = RequestMethod.GET)
	public Student home(@RequestBody Student s) {
		s.studying();
		System.out.println("this is home method");
		this.student.setName("sumit");
		return this.student;
	}
	
	@RequestMapping(value = "/user/{userId}",method =RequestMethod.GET)
	public String user(@PathVariable("userId") Integer userId) {
		return String.valueOf(userId);
	}
}
