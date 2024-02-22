package com.swpatil.demo.Inheritance.TablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Tpc_mentor")
public class Mentor extends User {
    private Long salary;
}
