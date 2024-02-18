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
    public void updateProductById(){

    }

    @PostMapping()
    public void createProduct(){

    }
}
