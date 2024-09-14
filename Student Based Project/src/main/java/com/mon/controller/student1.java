package com.mon.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.mon.dao.studentdao;
import com.mon.model.studentmodel;
import com.mon.service.servicemodel;


/**
 * Servlet implementation class student1
 */
public class student1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String studentName=req.getParameter("studentName");

		   studentdao dao = new studentdao();
	        servicemodel student = dao.getStudentDetail(studentName);
	        
	        if (student != null) {
	            // Pass student data to JSP or use directly in servlet
	            req.setAttribute("studentName", student.getStudentName());
	            req.setAttribute("Phonenumber", student.getPhonenumber());
	            req.setAttribute("address", student.getaddress());
	            req.setAttribute("Department", student.getDepartment());
	            req.setAttribute("courses", student.getCourses());
	            req.setAttribute("grades", student.getGrades());
	            req.setAttribute("attendance", student.getAttendance());
	            
	            // Forward to JSP to display the data
	            req.getRequestDispatcher("studentdetails.jsp").forward(req, res);
	        } else {
	            res.getWriter().println("Student not found.");
	        }
	}
}
