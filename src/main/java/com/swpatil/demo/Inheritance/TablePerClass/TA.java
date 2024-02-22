package com.swpatil.demo.Inheritance.TablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Tpc_ta")
public class TA extends User {
    private String startTime;
    private String endTime;

}
