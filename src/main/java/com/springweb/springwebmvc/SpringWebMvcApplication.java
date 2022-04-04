package com.springweb.springwebmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
public class SpringWebMvcApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringWebMvcApplication.class, args);

	}

	@GetMapping("/showName")
	public String showPage(@RequestParam(value = "myName", defaultValue = "World")String name) {

		return String.format("Hello %s!", name);
	}

}
