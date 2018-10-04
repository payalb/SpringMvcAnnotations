package com.java.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.java.config.DatabaseUtil;
import com.java.exception.DatabaseException;

@Component
public class ConnectionUtil {
	@Autowired
	private  ApplicationContext applicationContext;
	public  Connection getConnection() throws DatabaseException {
		DatabaseUtil util= applicationContext.getBean(DatabaseUtil.class);
		Connection connection= null;
		try {
			Class.forName(util.getDriverName());
		
		 connection=	DriverManager.getConnection(util.getUrl(), util.getUsername(), util.getPassword());
		} catch (ClassNotFoundException e) {
			throw new DatabaseException("Could not load the driver class for the database!"+ e.getMessage());
		} catch (SQLException e) {
			throw new DatabaseException("Could not connect to the database. Please check the credentials"+ e.getMessage());
		}
		return connection;
	}

	
}
