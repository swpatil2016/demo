package com.swpatil.demo.Services;

import com.swpatil.demo.Dtos.FakeStoreProductDto;
import com.swpatil.demo.Dtos.GenericProductDto;
import com.swpatil.demo.Exceptions.NotFoundProduct;
import com.swpatil.demo.ThirdPartyCommunicate.FakeStoreProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Primary
@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductService{
    FakeStoreProductClient fakeStoreProductClient;

    @Autowired
    public FakeStoreProductService(FakeStoreProductClient fakeStoreProductClient) {
        this.fakeStoreProductClient = fakeStoreProductClient;
    }

    public GenericProductDto getProductById(Long id) throws NotFoundProduct {
         FakeStoreProductDto fakeStoreProductDto = fakeStoreProductClient.getProductById(id);
        return convertFakeStoreDtoToGenericProductDto(fakeStoreProductDto);
    }


    public GenericProductDto createProduct(GenericProductDto genericProductDto) {

        FakeStoreProductDto fakeStoreProductDto = fakeStoreProductClient.createProduct(genericProductDto);
        return convertFakeStoreDtoToGenericProductDto(fakeStoreProductDto);
    }


    public List<GenericProductDto> getAllProducts() {

        FakeStoreProductDto[] fakeStoreProductDtos = fakeStoreProductClient.getAllProducts();
        List<GenericProductDto> genericProductDtos = new ArrayList<>();

        for(FakeStoreProductDto fakeStoreProductDto: fakeStoreProductDtos){
            genericProductDtos.add(convertFakeStoreDtoToGenericProductDto(fakeStoreProductDto));
        }
        return genericProductDtos;
    }

    public GenericProductDto deleteProductById(Long id) {

        FakeStoreProductDto fakeStoreProductDto = fakeStoreProductClient.deleteProductById(id);
        return convertFakeStoreDtoToGenericProductDto(fakeStoreProductDto);
    }

    public GenericProductDto convertFakeStoreDtoToGenericProductDto(FakeStoreProductDto fakeStoreProductDto){
        GenericProductDto genericProductDto = new GenericProductDto();
        genericProductDto.setId(fakeStoreProductDto.getId());
        genericProductDto.setCategory(fakeStoreProductDto.getCategory());
        genericProductDto.setImage(fakeStoreProductDto.getImage());
        genericProductDto.setDescription(fakeStoreProductDto.getDescription());
        genericProductDto.setTitle(fakeStoreProductDto.getTitle());
        genericProductDto.setPrice(fakeStoreProductDto.getPrice());

        return genericProductDto;
    }
}
