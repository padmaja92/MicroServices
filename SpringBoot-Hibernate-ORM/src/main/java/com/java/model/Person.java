package com.java.model;


import java.util.Date;
import java.util.logging.SimpleFormatter;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	@Id
	@Generated
	private int ID;
	private String name;	
	private Date dob;
	
	SimpleFormatter format = new SimpleFormatter();
	

	
	

}
