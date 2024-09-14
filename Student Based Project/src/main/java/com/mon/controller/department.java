package com.mon.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.mon.dao.studentdao;
import com.mon.service.servicemodel;

/**
 * Servlet implementation class department
 */
public class department extends HttpServlet {
	protected void service(HttpServletRequest req1, HttpServletResponse res1) throws ServletException, IOException {
		String department=req1.getParameter("department");
		  studentdao dao = new studentdao();
	        servicemodel student = dao.getStdept(department);
		   if (student != null) {
	            // Pass student data to JSP or use directly in servlet
	            req1.setAttribute("studentName", student.getStudentName());
	            req1.setAttribute("Phonenumber", student.getPhonenumber());
	            req1.setAttribute("address", student.getaddress());
	           
	            // Forward to JSP to display the data
	            req1.getRequestDispatcher("stdep.jsp").forward(req1, res1);
	        } else {
	            res1.getWriter().println("Student not found.");
	        }
}
}
