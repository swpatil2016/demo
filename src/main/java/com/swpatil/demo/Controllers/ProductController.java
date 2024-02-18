package com.swpatil.demo.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping()
    public void getAllProducts(){

    }

    @GetMapping("{id}")
    public void getProductById(@PathVariable("id") Long id){

    }

    @PutMapping("{id}")
    public String updateProductById(@PathVariable("id") Long id){
        return "Update the product whose id is: " + id;
    }

    @PostMapping()
    public void createProduct(){

    }
}
