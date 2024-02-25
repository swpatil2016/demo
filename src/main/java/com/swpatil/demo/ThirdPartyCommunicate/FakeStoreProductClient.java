package com.swpatil.demo.ThirdPartyCommunicate;

import com.swpatil.demo.ThirdPartyCommunicate.Dtos.FakeStoreProductDto;
import com.swpatil.demo.Dtos.GenericProductDto;
import com.swpatil.demo.Exceptions.NotFoundProduct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class FakeStoreProductClient {

    private String productUrl = "https://fakestoreapi.com/products/{id}";
    private String productRqUrl = "https://fakestoreapi.com/products";


    RestTemplateBuilder restTemplateBuilder;
    public FakeStoreProductClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public FakeStoreProductDto getProductById(Long id) throws NotFoundProduct {
        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<FakeStoreProductDto> responseEntity = restTemplate.getForEntity(
                productUrl,
                FakeStoreProductDto.class,
                id);
        if(responseEntity == null){
            return null;
        }
        FakeStoreProductDto fakeStoreProductDto = responseEntity.getBody();
        if(fakeStoreProductDto == null){
            throw new NotFoundProduct("Product with id: " + id + " not found.");
        }
        return fakeStoreProductDto;
    }


    public FakeStoreProductDto createProduct(GenericProductDto genericProductDto) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> responseEntity = restTemplate.postForEntity(
                productRqUrl,
                genericProductDto,
                FakeStoreProductDto.class);

        FakeStoreProductDto fakeStoreProductDto = responseEntity.getBody();
        return fakeStoreProductDto;
    }


    public FakeStoreProductDto[] getAllProducts() {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto[]> listResponseEntity = restTemplate.getForEntity(
                productRqUrl,
                FakeStoreProductDto[].class); // Try to use list and ParameterizedTypeReference<List<FakeStoreProductDto>>

        FakeStoreProductDto[] fakeStoreProductDtos = listResponseEntity.getBody();
        return fakeStoreProductDtos;
    }

    public FakeStoreProductDto deleteProductById(Long id) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> responseEntity =  restTemplate.exchange(
                productUrl,
                HttpMethod.DELETE,
                null,
                FakeStoreProductDto.class,
                id
        );
        FakeStoreProductDto fakeStoreProductDto = responseEntity.getBody();
        return fakeStoreProductDto;
    }
}
