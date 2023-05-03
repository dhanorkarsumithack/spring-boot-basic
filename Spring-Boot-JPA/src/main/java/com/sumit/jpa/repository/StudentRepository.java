package com.sumit.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sumit.jpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findByFirstName(String firstName);
	
	public List<Student> findByFirstNameContaining(String name);
	
	public List<Student> findByFirstNameNotNull();
	
	public List<Student> findByGuardian(String guardianName);
}
