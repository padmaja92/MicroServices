package com.java.customizedHealth;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InternetHealthCheck implements HealthIndicator{
	
	@Override
	public Health health() {
		// TODO Auto-generated method stub
		return internet()==true?Health.up().withDetail("200","Internet Active connection").build():
					 Health.up().withDetail("400","Internet does not have a Active connection").build();
	}

	private boolean internet(){
		boolean isActive = false;

		try {
			URL url = new URL("https://www.google.com");
			url.openConnection().connect();
			isActive = true;

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return isActive;

	}



}
