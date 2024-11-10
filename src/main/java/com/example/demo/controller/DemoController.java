package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @GetMapping("/greet")
    String greet(@RequestParam(required = false, defaultValue = "danah") String name) {
        return "Hello, " + name + "!";
    }


    @PostMapping("/farewell")
    public String farewell(@RequestBody String name) {
        return "Goodbye, "+name;
    }

}
