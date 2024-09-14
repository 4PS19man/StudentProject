package com.mon.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.websocket.server.ServerEndpoint;

import java.io.IOException;

import com.mon.model.studentmodel;
import com.mon.service.administratorservice;

/**
 * Servlet implementation class updatestudent
 */
public class updatestudent extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req4, HttpServletResponse res4) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req4.getParameter("name");
		String Phonenumber=req4.getParameter("Phonenumber");
		String address=req4.getParameter("address");
		String department=req4.getParameter("department");
		String courses=req4.getParameter("courses");
		String grades=req4.getParameter("grades");
		String attendance=req4.getParameter("attendance");
		administratorservice s1=new administratorservice(name,Phonenumber,address,department,courses,grades, attendance);
		studentmodel s2=new studentmodel();
		String s3=s2.update(s1);
	}
}
