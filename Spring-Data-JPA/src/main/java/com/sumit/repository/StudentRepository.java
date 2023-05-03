package com.sumit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
