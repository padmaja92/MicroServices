package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.DAO.PersonDAO;
import com.java.model.Person;

@RestController
@RequestMapping("/Spring-ORM")
public class Controller {
	
	@Autowired
	private PersonDAO personDAO;
	
	@PostMapping("/savePersonDetails")
	public String savePerson(@RequestBody Person person) {
		 personDAO.savePerson(person);
		 return "Sucess";
	}
	
	
	@GetMapping("/getPersonDetails")
	public List<Person> getPersonDetails(){
		return personDAO.getPerson();
		
	}

}
