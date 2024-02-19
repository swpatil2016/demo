package com.swpatil.demo.Dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ExceptionDto {
    private String massage;
    private HttpStatus httpStatus;

    public ExceptionDto(String massage, HttpStatus httpStatus) {
        this.massage = massage;
        this.httpStatus= httpStatus;
    }
}
// This Dto we created because we don't want to send all information of exception to front end like trace and all that,
// we will send well response we want like massage, Http status or etc.