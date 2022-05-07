package com.toby.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
	@Value("${customer.name}")
	private String name;
	@Value("${customer.age}")
	private int age;
	
	@RequestMapping("/")
	public String test() {
		return "Hello World" + name + age;
	}
	
	@RequestMapping("/test")
	public String test2() {
		return "Hello World 123";
	}
}
