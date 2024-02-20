package com.swpatil.demo.Exceptions;

import com.swpatil.demo.Dtos.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

    // All type of exception will check by this class due to @controllerAdvice. The method of this class
    // will call when exception occurs.
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(NotFoundProduct.class)
    public ResponseEntity<ExceptionDto> handleNotFoundExcetion(NotFoundProduct notFoundProduct){
        return new ResponseEntity<>(new ExceptionDto(notFoundProduct.getMessage(), HttpStatus.NOT_FOUND),
                HttpStatus.NOT_FOUND);
    }
}
