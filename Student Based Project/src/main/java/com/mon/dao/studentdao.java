package com.mon.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mon.service.administratorservice;
import com.mon.service.deleteservice;
import com.mon.service.facultyservicemodel;
import com.mon.service.servicemodel;

public class studentdao {
    String url = "jdbc:mysql://localhost:3306/studentdetails";
    String user = "root";
    String password = "monika@03";
    

    public servicemodel getStudentDetail(String studentName) {
        servicemodel student = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            
            String query = "SELECT * FROM student WHERE name = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, studentName);
            
            ResultSet res = pstmt.executeQuery();
            
            if (res.next()) { // If data is found
                String name = res.getString("name");
                String Phonenumber = res.getString("Phonenumber");
                String address = res.getString("address");
                String Department = res.getString("Department");
                String courses = res.getString("courses");
                String grades = res.getString("grades");
                String attendance = res.getString("attendance");
                
                // Create and return a single servicemodel object
                student = new servicemodel(name,Phonenumber,address ,Department,courses, grades, attendance);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
    public facultyservicemodel getfaculty(String department) {
        facultyservicemodel faculty = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            
            String query = "SELECT * FROM faculty WHERE department = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, department);
            
            ResultSet res = pstmt.executeQuery();
            
            if (res.next()) { // If data is found
                String department1 = res.getString("department");
                String name = res.getString("name");
                String email = res.getString("email");
                String phone = res.getString("phone");
               
                
                // Create and return a single servicemodel object
                faculty = new facultyservicemodel(department,name,email,phone);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return faculty;
    }
	public servicemodel getStdept(String department) {
		// TODO Auto-generated method stub
		 servicemodel student = null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection connection = DriverManager.getConnection(url, user, password);
	            
	            String query = "SELECT * FROM student WHERE department = ?";
	            PreparedStatement pstmt = connection.prepareStatement(query);
	            pstmt.setString(1, department);
	            
	            ResultSet res = pstmt.executeQuery();
	            
	            if (res.next()) { // If data is found
	                String name = res.getString("name");
	                String Phonenumber = res.getString("Phonenumber");
	                String address = res.getString("address");
	                String Department = res.getString("Department");
	                String courses = res.getString("courses");
	                String grades = res.getString("grades");
	                String attendance = res.getString("attendance");
	                
	                // Create and return a single servicemodel object
	                student = new servicemodel(name,Phonenumber,address ,Department,courses, grades, attendance);
	            }
	            
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	        return student;
	}
	public String createdetails(administratorservice obj) {
		// TODO Auto-generated method stub
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection connection = DriverManager.getConnection(url, user, password);
	            String query = "insert into student(name,Phonenumber,address,Department,courses,grades,attendance) values(?,?,?,?,?,?,?)";
	            PreparedStatement pstmt = connection.prepareStatement(query);
	            pstmt.setString(1, obj.getStudentName());
	            pstmt.setString(2, obj.getPhonenumber());
	            pstmt.setString(3, obj.getAddress());
	            pstmt.setString(4, obj.getDepartment());
	            pstmt.setString(5, obj.getCourses());
	            pstmt.setString(6, obj.getGrades());
	            pstmt.setString(7, obj.getAttendance());
	            int res=pstmt.executeUpdate();
	            if(res>0) {
	            	return "Successfully created";
	            }
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return "Somthing went wrong";
	}
	public String updatedetails(administratorservice obj) {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection connection = DriverManager.getConnection(url, user, password);

	        // Check if the student exists using a PreparedStatement
	        String checkQuery = "SELECT * FROM student WHERE name=?";
	        PreparedStatement checkStmt = connection.prepareStatement(checkQuery);
	        checkStmt.setString(1, obj.getStudentName());  // Set the student name parameter
	        ResultSet res = checkStmt.executeQuery();

	        if (res.next()) {  // If the student exists, proceed with the update
	            String updateQuery = "UPDATE student SET Phonenumber=?, address=?, Department=?, courses=?, grades=?, attendance=? WHERE name=?";
	            PreparedStatement pstmt = connection.prepareStatement(updateQuery);

	            pstmt.setString(1, obj.getPhonenumber());
	            pstmt.setString(2, obj.getAddress());
	            pstmt.setString(3, obj.getDepartment());
	            pstmt.setString(4, obj.getCourses());
	            pstmt.setString(5, obj.getGrades());
	            pstmt.setString(6, obj.getAttendance()); 
	            pstmt.setString(7, obj.getStudentName());  

	            int out = pstmt.executeUpdate();
	            if (out > 0) {
	                return "Updated successfully";
	            } else {
	                return "No update was made";
	            }
	        } else {
	            return "Student not found";
	        }
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	        return "Class not found exception occurred";
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return "SQL exception occurred";
	    }
	}
	public String deletedetails(deleteservice obj) {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection connection = DriverManager.getConnection(url, user, password);
	        
	        // SQL query to delete the record where the student name matches the given parameter
	        String deletequery = "DELETE FROM student WHERE name = ?";
	        PreparedStatement pstmt = connection.prepareStatement(deletequery);
	        
	        // Set the parameter value
	        pstmt.setString(1, obj.getStudentName());
	        
	        // Execute the update
	        int out = pstmt.executeUpdate();
	        
	        if (out > 0) {
	            return "Deleted successfully";
	        } else {
	            return "No record found to delete";
	        }
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	        return "Class not found exception occurred";
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return "SQL exception occurred";
	    }
	}
}
