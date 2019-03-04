package com.springboot.junit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloController {

	@GetMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
