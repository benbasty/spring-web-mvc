package com.springweb.springwebmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@SpringBootApplication
@RestController
public class ReadingHTMLFormData {

    public static void main(String[] args) {
        SpringApplication.run(ReadingHTMLFormData.class, args);
    }

    @GetMapping("/showLocation")
    public String showLocation(@RequestParam(value = "myLocation", defaultValue = "Everywhere") String location) {
        return String.format("Your location is: %s", location);
    }

}
