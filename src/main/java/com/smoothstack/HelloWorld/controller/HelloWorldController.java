package com.smoothstack.HelloWorld.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")

public class HelloWorldController {
	@GetMapping(path = "/allen")
	public String getAllen() {
		return "Hello Allen"; 
	}
	@GetMapping(path = "/diana")
	public String getDiana() {
		return "Hello Diana"; 
	}
	@GetMapping(path = "/world")
	public String getWorldn() {
		return "Hello World"; 
	}
}
