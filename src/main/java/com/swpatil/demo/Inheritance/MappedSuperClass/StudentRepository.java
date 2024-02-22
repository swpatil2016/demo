package com.swpatil.demo.Inheritance.MappedSuperClass;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    public Student save(Student student);
}
