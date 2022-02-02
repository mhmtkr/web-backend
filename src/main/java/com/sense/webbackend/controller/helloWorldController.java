package com.sense.webbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @GetMapping("/sayhello")
    public String sayHelloWorld(){
        return "Hello World!";
    }

}
