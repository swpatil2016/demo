package com.swpatil.demo.Inheritance.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name =  "S_Student")
@DiscriminatorValue(value = "2")
public class Student extends User {
    private String batch;
    private double psp;
}

