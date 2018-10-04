/*package com.java.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//java.sql package: jdbc classes
import com.java.dto.Student;
import com.java.exception.DatabaseException;
import com.java.util.ConnectionUtil;

public class StudentRepositoryImplOne implements StudentRepository , ApplicationContextAware{

	@Override
	public int addStudent(Student student) throws DatabaseException {
		int id= -1;
		try (
			Connection conn = applicationContext.getBean(ConnectionUtil.class).getConnection();
			Statement st = conn.createStatement();
			){
			st.executeUpdate("insert into student values ( idGenerator.nextval , " + student.getName() + " ,"
					+ student.getPassword() + ")");
			ResultSet set=st.executeQuery("select idGenerator.currval from dual");
			while(set.next()) {
				 id=set.getInt("idGenerator.currval");
			}
			set.close();
		} catch (SQLException e) {
			DatabaseException obj= applicationContext.getBean(DatabaseException.class);
			obj.set
			throw new DatabaseException("Unable to insert record into db"+ e.getMessage());
		}
		return id;
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

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext= applicationContext;
		
	}

	private ApplicationContext applicationContext;
}
*/