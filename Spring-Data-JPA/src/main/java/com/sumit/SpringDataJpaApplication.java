package com.sumit;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sumit.entities.Address;
import com.sumit.entities.Category;
import com.sumit.entities.Laptop;
import com.sumit.entities.Product;
import com.sumit.entities.Student;
import com.sumit.repository.CategoryRepository;
import com.sumit.repository.ProductRepository;
import com.sumit.repository.StudentRepository;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
public class SpringDataJpaApplication implements ApplicationRunner{

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		//oneToManyRelation();
	    manyToManyRelation();
	
	
	}
	
	
	//one to many
	public void oneToManyRelation() {
		Student student=new Student();
		student.setStudentName("sumit dhanorkar");
		student.setAbout("I am Software Engineer ");
		
		Address a1=new Address();
		
		a1.setCity("Washim");
		a1.setCountry("india");
		a1.setStreet("Ram nagar");
		a1.setStudent(student);
		
		Address a2=new Address();
		
		a2.setCity("amravati");
		a2.setCountry("india");
		a2.setStreet("shree nagar");
		a2.setStudent(student);
		
		Address a3 =new Address();
		
		a3.setCity("akola");
		a3.setCountry("india");
		a3.setStreet("i daf;g");
		a3.setStudent(student);
		
		student.setAddressList(List.of(a1,a2,a3));
		
		studentRepository.save(student);
		
		System.out.println("Address List :"+student.getAddressList());
		
	}
	
	public void oneToOneRelation() {
		Student student=new Student();
		student.setStudentName("amit dhanorkar");
		student.setAbout("I am Software Engineer ");
		
		Laptop laptop=new Laptop();
		laptop.setBrand("hp");
		laptop.setModelNumber("1234");
		
		laptop.setStudent(student);
		
		student.setLaptop(laptop);
		
		Student stud= studentRepository.save(student);
		
		System.out.println("saved student name: "+stud.getStudentName());
		
//		Student student=studentRepository.findById(3).get();
//		
//		System.out.println("Name is "+student.getStudentName());
//		
//		Laptop laptop=student.getLaptop();
//		System.out.println("Laptop brand is "+laptop.getBrand()+" and model is "+laptop.getModelNumber());
	
	
	}
	
	
	public void manyToManyRelation() {
		
		Product p1=new Product();
		p1.setpId("1");
		p1.setProductName("Iphone 12 pro");
		
		Product p2=new Product();
		p2.setpId("2");
		p2.setProductName("Samsung s20");
		
		Product p3=new Product();
		p3.setpId("3");
		p3.setProductName("Mi Tv");
		
		Product p4=new Product();
		p4.setpId("4");
		p4.setProductName("Lg Tv");
		
		Category c1=new Category();
		c1.setcId("cid1");
		c1.setTitle("Electronics");
		
		Category c2=new Category();
		c2.setcId("cid2");
		c2.setTitle("mobile");
		
//		short way of making list
		
//		c1.setProducts(List.of(p1,p2,p3,p4));
//		c2.setProducts(List.of(p1,p2));
//		
//		p1.setCategories(List.of(c1,c2));
//		p2.setCategories(List.of(c1,c2));
//		
//		p3.setCategories(List.of(c1));
//		p4.setCategories(List.of(c1));
		
		List<Product> cat1Prod=c1.getProducts();
		cat1Prod.add(p1);
		cat1Prod.add(p2);
		cat1Prod.add(p3);
		cat1Prod.add(p4);
		
		List<Product> cat2Prod=c2.getProducts();
		cat2Prod.add(p1);
		cat2Prod.add(p2);
		
		categoryRepository.save(c1);
		categoryRepository.save(c2);

		
		
	}
	

}
