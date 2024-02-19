package com.swpatil.demo.Services;

import com.swpatil.demo.Dtos.GenericProductDto;

import java.util.List;

public interface ProductService {
    public GenericProductDto getProductById(Long id);

    public GenericProductDto createProduct(GenericProductDto genericProductDto);

    public List<GenericProductDto> getAllProducts();

    public GenericProductDto deleteProductById(Long id);
    // Delete product may return anything or not, in our case FakeStore API returning the deleted product
    // so we are also returning it in GenericPrDto.
}
