package com.swpatil.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private int id;

    @GetMapping("/hwllo")
    public String printString(){
        return "Hello world";
    }

    /*
            This is how user pass the number
            http://localhost:8080/number?number=50
     */
    @GetMapping("/number")
    public String printId(@RequestParam(value = "number", defaultValue = "10") int id){
        return "This is id: " + id;
    }

    @GetMapping("/number")
    public int printNumber(@RequestParam(value = "number", defaultValue = "10") int id){
        return id;
    }
}
