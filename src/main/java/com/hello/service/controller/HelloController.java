package com.hello.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/svc/v1/hello")
public class HelloController {
	@GetMapping("/get/{abc}")
	public String helloWorld(@PathVariable String abc) {
		return "hello world " + abc ;
	}
}
