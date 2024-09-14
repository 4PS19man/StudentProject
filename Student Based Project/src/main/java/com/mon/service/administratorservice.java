package com.mon.service;

public class administratorservice {
	 private String studentName;
	    String Phonenumber;
	   String address;
	    String Department;
	     String courses;
	    String grades;
	    String attendance;
		/**
		 * @param studentName
		 * @param phonenumber
		 * @param address
		 * @param department
		 * @param courses
		 * @param grades
		 * @param attendance
		 */
		public administratorservice(String studentName, String phonenumber, String address, String department,
				String courses, String grades, String attendance) {
			super();
			this.studentName = studentName;
			Phonenumber = phonenumber;
			this.address = address;
			Department = department;
			this.courses = courses;
			this.grades = grades;
			this.attendance = attendance;
		}
		/**
		 * @return the studentName
		 */
		public String getStudentName() {
			return studentName;
		}
		/**
		 * @param studentName the studentName to set
		 */
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		/**
		 * @return the phonenumber
		 */
		public String getPhonenumber() {
			return Phonenumber;
		}
		/**
		 * @param phonenumber the phonenumber to set
		 */
		public void setPhonenumber(String phonenumber) {
			Phonenumber = phonenumber;
		}
		/**
		 * @return the address
		 */
		public String getAddress() {
			return address;
		}
		/**
		 * @param address the address to set
		 */
		public void setAddress(String address) {
			this.address = address;
		}
		/**
		 * @return the department
		 */
		public String getDepartment() {
			return Department;
		}
		/**
		 * @param department the department to set
		 */
		public void setDepartment(String department) {
			Department = department;
		}
		/**
		 * @return the courses
		 */
		public String getCourses() {
			return courses;
		}
		/**
		 * @param courses the courses to set
		 */
		public void setCourses(String courses) {
			this.courses = courses;
		}
		/**
		 * @return the grades
		 */
		public String getGrades() {
			return grades;
		}
		/**
		 * @param grades the grades to set
		 */
		public void setGrades(String grades) {
			this.grades = grades;
		}
		/**
		 * @return the attendance
		 */
		public String getAttendance() {
			return attendance;
		}
		/**
		 * @param attendance the attendance to set
		 */
		public void setAttendance(String attendance) {
			this.attendance = attendance;
		}
		@Override
		public String toString() {
			return "administratorservice [studentName=" + studentName + ", Phonenumber=" + Phonenumber + ", address="
					+ address + ", Department=" + Department + ", courses=" + courses + ", grades=" + grades
					+ ", attendance=" + attendance + "]";
		}
	    
}
