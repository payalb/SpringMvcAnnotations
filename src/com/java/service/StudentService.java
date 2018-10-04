package com.java.service;

import java.util.List;

import com.java.dto.Student;
import com.java.exception.DatabaseException;

//non-business related code
public interface StudentService {
		public void addStudent(Student student) throws DatabaseException;
		
		public void updateStudent(Student student);
		
		public void deleteStudent(Student student);
		
		public Student getStudentById(int id);
		
		public List<Student> getStudents();
}
