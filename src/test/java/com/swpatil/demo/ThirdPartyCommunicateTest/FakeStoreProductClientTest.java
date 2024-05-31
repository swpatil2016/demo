package com.swpatil.demo.ThirdPartyCommunicateTest;

import com.swpatil.demo.Dtos.GenericProductDto;
import com.swpatil.demo.Exceptions.NotFoundProduct;
import com.swpatil.demo.ThirdPartyCommunicate.Dtos.FakeStoreProductDto;
import com.swpatil.demo.ThirdPartyCommunicate.FakeStoreProductClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@SpringBootTest
public class FakeStoreProductClientTest {

    private String productUrl = "https://fakestoreapi.com/products/{id}";
    private String productRqUrl = "https://fakestoreapi.com/products";
    @MockBean
    RestTemplateBuilder restTemplateBuilderMock;

    @MockBean
    RestTemplate restTemplateMock;

    @Autowired
    FakeStoreProductClient fakeStoreProductClient;

    @MockBean
    GenericProductDto genericProductDtoMock;

/*    @Test
    public void TestGetProductById() throws NotFoundProduct {
        when(restTemplateBuilderMock.build())
                .thenReturn(restTemplateMock);

        FakeStoreProductDto fakeStoreProductDto = new FakeStoreProductDto();
        fakeStoreProductDto.setTitle("iPhone");
        fakeStoreProductDto.setCategory("Classic");

        when(restTemplateMock.getForEntity(eq(productUrl), eq(FakeStoreProductDto.class), eq(Long.class)))
                .thenReturn(new ResponseEntity<>(fakeStoreProductDto, HttpStatus.OK));

        FakeStoreProductDto fakeStoreProductDto1 = fakeStoreProductClient.getProductById(1L);

        Assertions.assertEquals(fakeStoreProductDto1.getTitle(), "iPhone", "Object is match");
    }*/

    @Test
    public void TestGetProductByIdForNullCheck() throws NotFoundProduct {
        when(restTemplateBuilderMock.build())
                .thenReturn(restTemplateMock);

        when(restTemplateMock.getForEntity(productUrl, FakeStoreProductDto.class, Long.class))
                .thenReturn(null);

        FakeStoreProductDto fakeStoreProductDto = fakeStoreProductClient.getProductById(1L);

        Assertions.assertNull(fakeStoreProductDto);
    }

    @Test
    public void TestCreateProductForNullCheck(){
        when(restTemplateBuilderMock.build())
                .thenReturn(restTemplateMock);

        when(restTemplateMock.postForEntity(productRqUrl, genericProductDtoMock, FakeStoreProductDto.class))
                .thenReturn(null);

        FakeStoreProductDto fakeStoreProductDto = fakeStoreProductClient.createProduct(genericProductDtoMock);

        Assertions.assertNull(fakeStoreProductDto);
    }
/*
    @Test
    public void TestCreateProduct(){
        FakeStoreProductDto fakeStoreProductDtoExpected = new FakeStoreProductDto();
        fakeStoreProductDtoExpected.setTitle("Android");

        when(restTemplateBuilderMock.build())
                .thenReturn(restTemplateMock);

        when(restTemplateMock.postForEntity(productRqUrl, genericProductDtoMock, FakeStoreProductDto.class))
                .thenReturn(new ResponseEntity<>(fakeStoreProductDtoExpected, HttpStatus.OK));

        FakeStoreProductDto fakeStoreProductDto = fakeStoreProductClient.createProduct(genericProductDtoMock);

        Assertions.assertEquals(fakeStoreProductDto.getTitle(), "Android");

    }*/
    @Test
    public void TestGetAllProduct(){
       FakeStoreProductDto fakeStoreProductDto1 = new FakeStoreProductDto();
       fakeStoreProductDto1.setTitle("ABC");

        FakeStoreProductDto fakeStoreProductDto2 = new FakeStoreProductDto();
        fakeStoreProductDto2.setTitle("XYZ");

        FakeStoreProductDto[] fakeStoreProductDtos = new FakeStoreProductDto[2];
        fakeStoreProductDtos[0] = fakeStoreProductDto1;
        fakeStoreProductDtos[1] = fakeStoreProductDto2;

        when(restTemplateBuilderMock.build()).thenReturn(restTemplateMock);

        when(restTemplateMock.getForEntity(eq(productRqUrl), eq(FakeStoreProductDto[].class)))
                .thenReturn(new ResponseEntity(fakeStoreProductDtos, HttpStatus.OK));

        FakeStoreProductDto[] fakeStoreProductDtosList = fakeStoreProductClient.getAllProducts();
        Assertions.assertEquals(fakeStoreProductDtosList[1].getTitle(), "XYZ");

    }
}
