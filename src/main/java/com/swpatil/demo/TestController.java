package com.swpatil.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private int id;
    private String name;

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

    @GetMapping("/value")
    public int printNumber(@RequestParam(value = "number", defaultValue = "10000") int id){
        return id;
    }

    /*
        Pass more than one value;
        Order does not matter;
        http://localhost:8080/std?name=swapnil&id=200
        http://localhost:8080/std?id=100&name=swapnil

    * */
    @GetMapping("/std")
    public String studentDetail(
            @RequestParam(value = "id", defaultValue = "10") int id,
            @RequestParam(value = "name", defaultValue = "student") String name) {
        return "This is Student name: " + name + " and this is his id: " + id + ".";
    }

}
