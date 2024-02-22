package com.swpatil.demo.Inheritance.SingleTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class S_Mentor extends S_User {
    private Long salary;
}
