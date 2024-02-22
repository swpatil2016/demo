package com.swpatil.demo.Inheritance.TablePerClass;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MentorRepository extends JpaRepository<Mentor, Long> {

    public Mentor save(Mentor mentor);
}
