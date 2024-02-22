package com.swpatil.demo.Inheritance.SingleTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "S_Mentor")
public class Mentor extends User {
    private Long salary;
}
