package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    private String greeting = "Hello";

    @PutMapping("/update")
    public String updateGreeting(@RequestBody Greeting newGreeting) {
        greeting = newGreeting.getGreeting();
        return "Greeting updated to: " + greeting;
    }

    public static class Greeting {
        private String greeting;
        public String getGreeting() { return greeting; }
        public void setGreeting(String greeting) { this.greeting = greeting; }
    }
}
