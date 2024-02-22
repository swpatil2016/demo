package com.swpatil.demo.Inheritance.SingleTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class S_Student extends S_User {
    private String batch;
    private double psp;
}

