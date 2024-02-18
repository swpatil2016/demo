package com.swpatil.demo.Controllers;

import com.swpatil.demo.Dtos.GenericProductDto;
import com.swpatil.demo.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    ProductService productService;
/*
            Type of dependency injection
    -> Field injection
    @Autowired
    ProductService productService;

    -> Constructor injection
    -> Using setterMethode
 */

    // -> Constructor injection. This is more popular than field injection because of some points.
    @Autowired
    public ProductController(@Qualifier("FakeStoreProductService") ProductService productService) {
        this.productService = productService;
    }
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
    public GenericProductDto createProduct(@RequestBody GenericProductDto genericProductDto){
        return productService.createProduct(genericProductDto);
    }
}
