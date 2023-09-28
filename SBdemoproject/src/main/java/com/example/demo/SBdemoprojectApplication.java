package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SBdemoprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SBdemoprojectApplication.class, args);
		
		Student student= new Student();
		student.setId(100);
		student.setFirstname("saikumar");
		student.setLastname("Chinthakunta");
		
		System.out.println(student.getId());
		System.out.println(student.getFirstname());
		System.out.println(student.getLastname());
		
	}

}
