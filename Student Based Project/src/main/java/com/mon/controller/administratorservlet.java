package com.mon.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

import com.mon.model.studentmodel;
import com.mon.service.administratorservice;

/**
 * Servlet implementation class administratorservlet
 */
public class administratorservlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req2, HttpServletResponse res3) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String name=req2.getParameter("name");
	String Phonenumber=req2.getParameter("Phonenumber");
	String address=req2.getParameter("address");
	String department=req2.getParameter("department");
	String courses=req2.getParameter("courses");
	String grades=req2.getParameter("grades");
	String attendance=req2.getParameter("attendance");
	administratorservice s1=new administratorservice(name,Phonenumber,address,department,courses,grades, attendance);
	studentmodel s2=new studentmodel();
	String s3=s2.add(s1);
}
}
