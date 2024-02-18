package com.swpatil.demo.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String title;
    private Category category;
    private double price;
    private String description;
    private String image;
}
