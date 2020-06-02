package com.java.orm.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.orm.Model.Student;

public interface StudentDAO extends JpaRepository<Student, Integer>{

}
