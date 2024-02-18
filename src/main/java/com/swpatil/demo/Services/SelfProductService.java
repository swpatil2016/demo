package com.swpatil.demo.Services;

import com.swpatil.demo.Dtos.GenericProductDto;
import org.springframework.stereotype.Service;

@Service("SelfProductService")
public class SelfProductService implements ProductService{
    @Override
    public GenericProductDto getProductById(Long id) {
        return null;
    }
}
