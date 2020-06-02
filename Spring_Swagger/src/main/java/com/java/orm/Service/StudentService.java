package com.java.orm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.orm.DAO.StudentDAO;
import com.java.orm.Model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDAO daoLayer;	
	
	
	public StudentService(StudentDAO daoLayer) {
		super();
		this.daoLayer = daoLayer;
	}

	// Method to store student details

	public void saveStudent(Student student) {
		
		daoLayer.save(student);
		
	}
	
	//methdo to get StudentDetailsList
	
	public List<Student> getStudentDetails(int studentID){
		return daoLayer.findAll();
		
	}
	
	//method to delete student details based on given ID
	
	public List<Student> removeStudent(int studentID) {
		daoLayer.deleteById(studentID);
		return daoLayer.findAll();
	}
	
	

}
