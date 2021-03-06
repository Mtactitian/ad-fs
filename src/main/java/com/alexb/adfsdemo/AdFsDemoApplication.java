package com.alexb.adfsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AdFsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdFsDemoApplication.class, args);
    }

    @GetMapping("/")
    public String test() {
        return "ok";
    }
}
