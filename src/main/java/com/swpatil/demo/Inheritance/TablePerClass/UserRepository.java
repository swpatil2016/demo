package com.swpatil.demo.Inheritance.TablePerClass;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    public List<User> findAll();
}
