package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApplication {

    @RequestMapping("/")
    public String hello() {
        return "hello docker world this the first deployment demo project";
    }
}
