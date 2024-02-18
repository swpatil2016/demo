package com.swpatil.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    public void getAllProducts(){

    }

    @GetMapping("/products/{id}")
    public void getProductById(){

    }

    @PutMapping("/products/{id}")
    public void updateProductById(){

    }

    @PostMapping("/products")
    public void createProduct(){

    }
}
