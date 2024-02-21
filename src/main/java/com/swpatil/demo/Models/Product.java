package com.swpatil.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
public class Product extends BaseModel {
    private String title;
    private double price;
    private String description;
    private String image;

    @ManyToOne
    private Category category;

//    public static void main(String[] args) {
//        UUID id = UUID.randomUUID();
//        System.out.println(id);
//    }
}
