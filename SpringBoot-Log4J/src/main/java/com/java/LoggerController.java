package com.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {
	
	Logger logger = LoggerFactory.getLogger(LoggerController.class);
	
	
	@GetMapping("/getMessage/{name}")
	public String getMessage(@PathVariable String name) {
		logger.debug("Request {}", name);
		
		if(name.equals("test")) {
			new RuntimeException("Exception ocurred");
		}
		
		String response = "Hello" +name;
		logger.debug("Response {}", name);

		return response;
	}

}
