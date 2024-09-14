package com.mon.model;

import java.util.ArrayList;
import java.util.List;

import com.mon.dao.studentdao;
import com.mon.service.administratorservice;
import com.mon.service.deleteservice;
import com.mon.service.facultyservicemodel;
import com.mon.service.servicemodel;




public class studentmodel {
	List<servicemodel> list = new ArrayList<servicemodel>();
	public List<servicemodel> getstddetail(String studentName ){
		studentdao dao = new studentdao();
		return null;
	}
	public List<facultyservicemodel> getfaculty(String department ){
		studentdao dao = new studentdao();
		return null;
	}
	public List<administratorservice> list1 = new ArrayList<administratorservice>();
	studentdao dao = new studentdao();
     public String add(administratorservice obj) {
    	 return dao.createdetails(obj);
     }
     public String update(administratorservice obj) {
    	 return dao.updatedetails(obj);
     }
   
	public List<deleteservice>list2 =new ArrayList<deleteservice>();
	public String delete(deleteservice obj) {
		return dao.deletedetails(obj);
	}
	
}
