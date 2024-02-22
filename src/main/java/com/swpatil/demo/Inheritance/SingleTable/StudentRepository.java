package com.swpatil.demo.Inheritance.SingleTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("S_StudentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student save(Student student);
}
