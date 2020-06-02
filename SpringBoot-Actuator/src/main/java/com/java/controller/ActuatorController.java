package com.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot-Actuator")
public class ActuatorController {
	
	
	// This example is used to display Actuator end Point 
	
	@GetMapping("/getHealth")
	public String getHealth() {
		return "Health of Actuator";
	}

}
