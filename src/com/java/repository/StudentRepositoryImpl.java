package com.java.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.java.dto.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository{
	
	public Map<Integer, Student> map= new HashMap<>();

	@Override
	public int addStudent(Student student) {
		map.put(student.getId(), student);
		System.out.println("Added student "+ student);
;		return student.getId();
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
