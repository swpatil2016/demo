package com.swpatil.demo.Services;

import com.swpatil.demo.Dtos.FakeStoreProductDto;
import com.swpatil.demo.Dtos.GenericProductDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Primary
@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductService{
    RestTemplateBuilder restTemplateBuilder;

    public FakeStoreProductService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public GenericProductDto getProductById(Long id) {
        RestTemplate restTemplate = restTemplateBuilder.build();

        restTemplate.getForEntity(
                "https://fakestoreapi.com/products/{id}",
                FakeStoreProductDto.class,
                id);
        return null;
    }
}
