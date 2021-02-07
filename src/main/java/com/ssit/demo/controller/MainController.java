package com.ssit.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author dhanu
 *
 *
 */
@RequestMapping("/")
public class MainController {
	@GetMapping
	public String helloword() {
		return "Hello World";
	}

}
