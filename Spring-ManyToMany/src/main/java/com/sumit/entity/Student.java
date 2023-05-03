package com.sumit.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_table")
public class Student {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int age;
	private String dept;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(
		
		name = "student_course_table",
		joinColumns = {
				@JoinColumn(name="student_id",referencedColumnName = "id")

		},
		inverseJoinColumns = {
				@JoinColumn(name="course_id",referencedColumnName = "id")
				
		}
			
	)
	@JsonManagedReference
	private List<Course> courses;
	
}
