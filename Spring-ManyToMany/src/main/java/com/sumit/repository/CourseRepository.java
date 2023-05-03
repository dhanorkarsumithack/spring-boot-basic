package com.sumit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

	List<Course> findByFeeLessThan(double fee);
}
