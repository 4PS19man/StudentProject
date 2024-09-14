package com.mon.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.mon.dao.studentdao;
import com.mon.model.studentmodel;
import com.mon.service.administratorservice;
import com.mon.service.deleteservice;
import com.mon.service.servicemodel;

/**
 * Servlet implementation class delete
 */
public class delete extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req5, HttpServletResponse res5) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String studentName=req5.getParameter("studentName");
		deleteservice s1=new deleteservice(studentName);
		studentmodel s2=new studentmodel();
		String s3=s2.delete(s1);
	}
}
