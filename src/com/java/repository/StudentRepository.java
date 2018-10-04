package com.java.repository;

import java.util.List;

import com.java.dto.Student;
import com.java.exception.DatabaseException;

public interface StudentRepository {
//dao layer: DML
	
	// add a student record: insert
	public int addStudent(Student student) throws DatabaseException;
	
	//update
	public void updateStudent(Student student);
	
	//delete
	public void deleteStudent(Student student);
	
	//get data
	public Student getStudentById(int id);
	
	public List<Student> getStudents();
}
