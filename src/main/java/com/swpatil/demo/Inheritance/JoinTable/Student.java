package com.swpatil.demo.Inheritance.JoinTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name =  "J_Student")
@PrimaryKeyJoinColumn(name = "User_id")
public class Student extends User {
    private String batch;
    private double psp;
}

