package com.swpatil.demo.Services;

import com.swpatil.demo.Dtos.GenericProductDto;

import java.util.List;

public interface ProductService {
    public GenericProductDto getProductById(Long id);

    public GenericProductDto createProduct(GenericProductDto genericProductDto);

    public List<GenericProductDto> getAllProducts();
}
