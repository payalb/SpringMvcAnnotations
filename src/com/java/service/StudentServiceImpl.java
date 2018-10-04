package com.java.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.dto.Student;
import com.java.exception.DatabaseException;
import com.java.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository repository;
	
	public StudentServiceImpl(StudentRepository repository){
		this.repository= repository;
	}
	
	@Override
	public void addStudent(Student student) throws DatabaseException {
		
		repository.addStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
