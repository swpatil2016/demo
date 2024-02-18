package com.swpatil.demo.Services;

import com.swpatil.demo.Dtos.GenericProductDto;

public interface ProductService {
    public GenericProductDto getProductById(Long id);
}
