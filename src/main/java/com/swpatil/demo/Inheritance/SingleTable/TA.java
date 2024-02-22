package com.swpatil.demo.Inheritance.SingleTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "S_TA")
public class TA extends User {
    private String startTime;
    private String endTime;

}
