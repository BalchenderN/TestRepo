package com.nisum.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@GetMapping(value = "/welcome")
	public String getMethodName() {
		System.out.println("Get Mapping method invoked");
		return "Welcome to Spring boot";
	}

}
