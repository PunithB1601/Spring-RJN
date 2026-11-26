package com.dcl;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dcl.entity.Student;
import com.dcl.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		StudentRepository srepo=context.getBean(StudentRepository.class);
		//System.out.println(srepo.getClass().getName());
	/**	
		Insert Operation / Update Operation
		====================================
		Student s=new Student();
		s.setStudentId(1);
		s.setStudentName("Vinayak Gowda");
		s.setPhone("123451345");
		s.setEmail("vinayak@gmail.com");
		Student savedData=srepo.save(s);
		System.out.println(savedData.getStudentId());
		
		Student s1=new Student(2, "Sahana", "9876598765", "sahana@gmail.com");
		Student s2=new Student(3, "Vanitha", "9876598761", "v@gmail.com");
		Student s3=new Student(4, "Tejaswini", "9876598762", "t@gmail.com");
		Student s4=new Student(5, "Hemanth", "9876598763", "hemanth@gmail.com");
		Student s5=new Student(6, "Laluprasad", "9876598764", "lp@gmail.com");
		
		List<Student> sList =(List<Student>)srepo.saveAll(Arrays.asList(s1,s2,s3,s4,s5));
		System.out.println("All data saved");
		
		
		 Fetching the Data from DB
		 ==========================
		Student s=srepo.findById(1).orElse(null);
		System.out.println(s);
		
		srepo.findAllById(Arrays.asList(1,2,3,4)).forEach(System.out::println);
		
		srepo.findAll().forEach(System.out::println);
		
		System.out.println(srepo.existsById(1)); 
		
		DELETE OPERATION
		=================
		srepo.deleteById(2);
		
		srepo.deleteAllById(Arrays.asList(2,3));
		
		srepo.delete(srepo.findById(1).orElse(null));
		
		srepo.deleteAll();
		
		**/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
