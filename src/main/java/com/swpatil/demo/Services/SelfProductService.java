package com.swpatil.demo.Services;

import com.swpatil.demo.Dtos.GenericProductDto;
import org.springframework.stereotype.Service;

@Service("SelfProductService")
public class SelfProductService implements ProductService{
    @Override
    public GenericProductDto getProductById(Long id) {
        System.out.println("Call from Self Product");
        return null;
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto genericProductDto) {
        return null;
    }
}
