package com.mon.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

import com.mon.dao.studentdao;
import com.mon.service.facultyservicemodel;
import com.mon.service.servicemodel;

/**
 * Servlet implementation class faculty
 */
public class faculty extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String department=req.getParameter("department");
		 studentdao dao = new studentdao();
	        facultyservicemodel faculty = dao.getfaculty(department);
	        
	        if (faculty != null) {
	            // Pass student data to JSP or use directly in servlet
	            req.setAttribute("department", faculty.getDepartment());
	            req.setAttribute("name", faculty.getName());
	            req.setAttribute("email", faculty.getEmail());
	            req.setAttribute("phone", faculty.getPhone());
	            req.setAttribute("email", faculty.getEmail());
	            
	            // Forward to JSP to display the data
	            req.getRequestDispatcher("facultydetails.jsp").forward(req, res);
	        } else {
	            res.getWriter().println("Faculty not found.");
	        }
	}

}
