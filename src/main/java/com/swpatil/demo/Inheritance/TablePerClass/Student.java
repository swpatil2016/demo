package com.swpatil.demo.Inheritance.TablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Tpc_student")
public class Student extends User {
    private String batch;
    private double psp;
}

