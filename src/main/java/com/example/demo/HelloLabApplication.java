package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloLabApplication.class, args);
	}

	@GetMapping("say-welcome")
	public String sayWelcome() {
		return "Welcome to Lab";
	}
}
