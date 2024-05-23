package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

	@GetMapping("/home")
	public String homePage() {
		return "/index.html";
	}
	
	@GetMapping("/good")
	public String apiTest() {
		return "good!";
	}
}
