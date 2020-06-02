package com.java.customizedHealth;

import javax.annotation.Generated;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Endpoint(id="testEndpoint", enableByDefault = true)
public class CustomizedEndpoint {

	@ReadOperation	
	public endpointResponse getREsponse() {
	return new endpointResponse("1", "HelloCustome End point");
	}
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

class endpointResponse{
	@lombok.Generated
	String id;
	String message;
	
}
