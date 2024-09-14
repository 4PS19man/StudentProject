package com.mon.service;

public class deleteservice {
	 private String studentName;

	/**
	 * @param studentName
	 */
	public deleteservice(String studentName) {
		
		this.studentName = studentName;
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

	@Override
	public String toString() {
		return "deleteservice [studentName=" + studentName + "]";
	}
}
