package com.java.orm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.orm.Model.Student;
import com.java.orm.Service.StudentService;

@RestController
@RequestMapping("/StudentService")
public class Controller {
	
	@Autowired
	private StudentService service;
	
	//method to store student
	
	@PostMapping("/saveStudent")
	public void saveStudent(@RequestBody Student student) {
		service.saveStudent(student);
	}
	
	//method to get details
	@GetMapping("/getStudent")
	public void getStudent(int studentID) {
		service.getStudentDetails(studentID);
	}
	//method to delete student and get list
	
	@DeleteMapping
	public List<Student> findListAfterDeleting(int studentID){
		return service.removeStudent(studentID);
	}
}
