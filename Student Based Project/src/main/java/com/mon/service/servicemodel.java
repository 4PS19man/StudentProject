package com.mon.service;

public class servicemodel {
    private String studentName;
    private String Phonenumber;
    private String address;
    private String Department;
    private String courses;
    private String grades;
    private String attendance;
   

    // Constructor
    public servicemodel(String studentName,String Phonenumber,String address,String Department ,String courses, String grades, String attendance) {
        this.studentName = studentName;
        this.Phonenumber=Phonenumber;
        this.address=address;
        this.Department=Department;
        this.courses = courses;
        this.grades = grades;
        this.attendance = attendance;
      
    }

    // Getters
    public String getStudentName() {
        return studentName;
    }
    public String getPhonenumber() {
    	return Phonenumber;
    }
    public String getaddress() {
    	return address;
    }
	public String getDepartment() {
		// TODO Auto-generated method stub
		return Department;
	}
    public String getCourses() {
        return courses;
    }
   
    public String getGrades() {
        return grades;
    }

    public String getAttendance() {
        return attendance;
    }

	
}
