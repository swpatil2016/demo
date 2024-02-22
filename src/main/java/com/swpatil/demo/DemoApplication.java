package com.swpatil.demo;

import com.swpatil.demo.Inheritance.SingleTable.Student;
import com.swpatil.demo.Inheritance.SingleTable.StudentRepository;
import com.swpatil.demo.Inheritance.TablePerClass.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.crypto.Data;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	StudentRepository studentRepository;
	TaRepository taRepository;
	MentorRepository mentorRepository;
	UserRepository userRepository;

	public DemoApplication(StudentRepository studentRepository, TaRepository taRepository, MentorRepository mentorRepository, UserRepository userRepository) {
		this.studentRepository = studentRepository;
		this.taRepository = taRepository;
		this.mentorRepository = mentorRepository;
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student student = new Student();
//		student.setBatch("oct 2022");
//		student.setPsp(30.4);
//		student.setEmail("Student@gmail.com");
//		student.setName("Bhuvan");
//
//		studentRepository.save(student);

//		TA ta= new TA();
//		ta.setName("Aakash");
//		ta.setEndTime("4554");
//		ta.setStartTime("454");
//		ta.setId(2L);
//
//		taRepository.save(ta);
//
//		Mentor mentor = new Mentor();
//		mentor.setName("Kavita");
//		mentor.setId(4L);
//
//		mentorRepository.save(mentor);

		List<User> users = userRepository.findAll();
		for(User user: users){
			System.out.println(user.getName());
		}

	}
}
