/*package com.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.java.dto.Student;
import com.java.exception.DatabaseException;
import com.java.service.StudentService;

@Controller
public class StudentController implements Controller {

	private StudentService service;
	public StudentController(StudentService service){
		this.service=service;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String servletPath = request.getServletPath();
		ModelAndView mv = new ModelAndView();
		if (servletPath.contains("addStudent")) {
			Student st= new Student();
			st.setName(request.getParameter("staticEmail2"));
			st.setPassword(request.getParameter("inputPassword2"));
			try {
				service.addStudent(st);
			
			mv.setViewName("displayStudent");
			request.setAttribute("message", "Student added to db!");
			request.setAttribute("student", st);
			} catch (DatabaseException e) {
				mv.setViewName("error");
				request.setAttribute("message", e.getMessage());
			}
		} else if (servletPath.contains("updateStudent")) {
			mv.setViewName("displayStudent");
			request.setAttribute("message", "Student updated in db!");
		}
		return mv;
	}

}
*/