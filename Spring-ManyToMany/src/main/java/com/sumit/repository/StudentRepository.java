package com.sumit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	List<Student> findByNameContaining(String name);
	
}
