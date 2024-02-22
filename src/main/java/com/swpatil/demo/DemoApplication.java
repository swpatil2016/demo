package com.swpatil.demo;

import com.swpatil.demo.Inheritance.MappedSuperClass.Student;
import com.swpatil.demo.Inheritance.MappedSuperClass.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	StudentRepository studentRepository;

	@Autowired
	public DemoApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		student.setBatch("oct 2022");
		student.setPsp(30.4);
		student.setEmail("Student@gmail.com");
		student.setName("Bhuvan");

		studentRepository.save(student);
	}
}
