package com.swpatil.demo.Exceptions;

public class NotFoundProduct extends Exception{
    public NotFoundProduct(String message) {
        super(message);
    }
}
