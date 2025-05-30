package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Spring Boot API!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
}
