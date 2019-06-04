package com.example.demo.controller;

import javax.annotation.security.PermitAll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "demo")
public class Demo {
	
	@PermitAll
	@GetMapping("/getDemo")
	String getMessage() {
		return "Hello from Demo";
	}

}
