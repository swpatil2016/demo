package com.swpatil.demo.ThirdPartyCommunicateTest;

import com.swpatil.demo.Exceptions.NotFoundProduct;
import com.swpatil.demo.ThirdPartyCommunicate.Dtos.FakeStoreProductDto;
import com.swpatil.demo.ThirdPartyCommunicate.FakeStoreProductClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import static org.mockito.ArgumentMatchers.any;
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

    @Test
    public void TestGetProductByIdForNullCheck() throws NotFoundProduct {
        when(restTemplateBuilderMock.build())
                .thenReturn(restTemplateMock);

        when(restTemplateMock.getForEntity(productUrl, FakeStoreProductDto.class, any(Long.class)))
                .thenReturn(null);

        FakeStoreProductDto fakeStoreProductDto = fakeStoreProductClient.getProductById(1L);

        Assertions.assertNull(fakeStoreProductDto);

    }

}
