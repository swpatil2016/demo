package com.swpatil.demo.Services;

import com.swpatil.demo.Dtos.GenericProductDto;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductService implements ProductService{
    @Override
    public GenericProductDto getProductById(Long id) {
        return null;
    }
}
