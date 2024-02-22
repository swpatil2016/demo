package com.swpatil.demo.Inheritance.SingleTable;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "S_Mentor")
@DiscriminatorValue(value = "1")
public class Mentor extends User {
    private Long salary;
}
