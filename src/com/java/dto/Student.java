package com.java.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

//validate: javax.validation, hibernate-validator
public class Student {
	
	
	private int id;
	@NotEmpty
	@Size(min=3, max=50, message="Name should be between 3 and 50 characters")
	private String name;
	@Pattern(regexp="[/W]+[a-zA-Z]+[0-9]+", message="Password should have atleast 1 numeric and 1 special character")
	@Size(min=7, max=20, message="Length of password should be between 7 and 20")
	private String password;
	
	private LocalDate doj;  /*15/07*/
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

}
