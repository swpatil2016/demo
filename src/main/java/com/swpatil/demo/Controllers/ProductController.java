package com.swpatil.demo.Controllers;

import com.swpatil.demo.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {


    ProductService productService;

    @GetMapping()
    public void getAllProducts(){

    }

    @GetMapping("{id}")
    public void getProductById(@PathVariable("id") Long id){
        productService.getProductById(id);
    }

    @PutMapping("{id}")
    public String updateProductById(@PathVariable("id") Long id){
        return "Update the product whose id is: " + id;
    }

    @PostMapping()
    public void createProduct(){

    }
}
