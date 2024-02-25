package com.swpatil.demo;

import com.swpatil.demo.Inheritance.JoinTable.Student;
import com.swpatil.demo.Inheritance.JoinTable.StudentRepository;
import com.swpatil.demo.Inheritance.TablePerClass.*;
import com.swpatil.demo.Models.Category;
import com.swpatil.demo.Models.Product;
import com.swpatil.demo.Repository.CategoryRepository;
import com.swpatil.demo.Repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	StudentRepository studentRepository;
	CategoryRepository categoryRepository;
	ProductRepository productRepository;

	public DemoApplication(StudentRepository studentRepository,
						   CategoryRepository categoryRepository,
						   ProductRepository productRepository) {
		this.studentRepository = studentRepository;
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
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
//
//
//		Category category = new Category();
//		category.setName("electronic");
//
//		categoryRepository.save(category);
//
//		Product product = new Product();
//		product.setPrice(4L);
//		product.setImage("imagebv");
//		product.setCategory(category);
//		product.setDescription("description123");
//		product.setTitle("product123");
//
//
//		productRepository.save(product);
//
//		Optional<Category> categoryOptional =
//				categoryRepository.findById(UUID.fromString("3C9801AF-8E14-49F9-A45B-96D442B02A6B"));
//
//
//		if(!categoryOptional.isEmpty()){
//			Category category = categoryOptional.get();
//			System.out.println(category.getProducts());
//		}

//        List<Product> product1 = productRepository.getAll();
//        System.out.println(product1);

	}
}

