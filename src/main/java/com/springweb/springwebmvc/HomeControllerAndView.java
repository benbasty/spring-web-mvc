package com.springweb.springwebmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HomeControllerAndView {
    public static void main(String[] args) {
        // Run the spring application in the main
        SpringApplication.run(HomeControllerAndView.class, args);
    }

    @GetMapping("/hi")
    public String showHello() {
        return "Hi Everyone!";
    }


}
