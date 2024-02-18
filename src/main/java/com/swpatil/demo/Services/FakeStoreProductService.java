package com.swpatil.demo.Services;

import com.swpatil.demo.Dtos.GenericProductDto;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductService{
    @Override
    public GenericProductDto getProductById(Long id) {
        System.out.println("Call from FakeStore");
        return null;
    }
}
