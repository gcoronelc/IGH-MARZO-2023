package com.desarrollasoftware.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Autowired
	private Environment environment;

	@GetMapping({"/","/saludo"})
	public String home() {
		return environment.getProperty("saludo");
	}
	
}
