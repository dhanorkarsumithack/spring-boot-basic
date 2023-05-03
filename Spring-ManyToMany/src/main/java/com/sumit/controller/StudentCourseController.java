package com.sumit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.Course;
import com.sumit.entity.Student;
import com.sumit.repository.CourseRepository;
import com.sumit.repository.StudentRepository;

@RestController
@RequestMapping("/student/course")
public class StudentCourseController {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	@PostMapping
	public Student saveStudentWithCouse(@RequestBody Student student) {
		return  studentRepository.save(student);
	}
	
	@GetMapping
	public List<Student> findAllStudent(){
		return studentRepository.findAll();
	}
	
	
	@GetMapping("/{studentId}")
	public Student findStudent(@PathVariable Long studentId) {
		return studentRepository.findById(studentId).get();
	}
	
	@GetMapping("/find/{name}")
	public List<Student> findStudentsContainingByName(@PathVariable String name){
		return studentRepository.findByNameContaining(name);
	}
	
	@GetMapping("/search/{price}")
	public List<Course> findCourseLessThanPrice(@PathVariable double price){
		return courseRepository.findByFeeLessThan(price);
		
	}
	
}
