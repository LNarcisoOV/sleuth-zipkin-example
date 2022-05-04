package com.tracing.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class ExampleController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ExampleController.class);
	
	@Autowired
	private RestTemplate restTemplate;
			
	@GetMapping
	public String example1() {
		LOGGER.info("GET IN EXAMPLE CONTROLLER.");
		return "Hello World.";
	}
	
	@GetMapping("/exp2")
	public String example2() {
		LOGGER.info("GET IN EXAMPLE 2 CONTROLLER.");
		return restTemplate.getForObject("http://localhost:8080/", String.class);
	}
}
