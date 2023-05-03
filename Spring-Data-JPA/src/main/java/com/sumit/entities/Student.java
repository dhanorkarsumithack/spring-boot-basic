package com.sumit.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_student")
public class Student {

	@Id
	@SequenceGenerator(
			name="stud_sequence",
			sequenceName = "stud_sequence",
			allocationSize = 1
	)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stud_sequence")
	private int studentId;
	
	private String studentName;
	private String about;
	
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL )
	private Laptop laptop;
	
	
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	private List<Address> addressList=new ArrayList<>();

	public Laptop getLaptop() {
		return laptop;
	}



	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}



	public List<Address> getAddressList() {
		return addressList;
	}



	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}



	public Student(String studentName, String about, Laptop laptop) {
		this.studentName = studentName;
		this.about = about;;
	}

	

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}



	public Student() {
		
	}
	
	
	
	
}
