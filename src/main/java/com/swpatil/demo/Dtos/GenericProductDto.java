package com.swpatil.demo.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericProductDto {
    private Long id;
    private String title;
    private String category;
    private double price;
    private String description;
    private String image;
}
