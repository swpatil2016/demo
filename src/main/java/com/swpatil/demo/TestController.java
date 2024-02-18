package com.swpatil.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hwllo")
    public String printString(){
        return "Hello world";
    }
}
