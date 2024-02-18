package com.swpatil.demo.Controllers;

import com.swpatil.demo.Dtos.GenericProductDto;
import com.swpatil.demo.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping()
    public void getAllProducts(){

    }

    @GetMapping("{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id){
       return productService.getProductById(id);
    }

    @PutMapping("{id}")
    public String updateProductById(@PathVariable("id") Long id){
        return "Update the product whose id is: " + id;
    }

    @PostMapping()
    public void createProduct(){

    }
}
