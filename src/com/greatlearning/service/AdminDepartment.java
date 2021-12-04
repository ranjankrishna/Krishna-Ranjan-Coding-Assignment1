package com.greatlearning.service;
import com.greatlearning.model.*;

public class AdminDepartment extends SuperDepartment {
	Department dep = new Department();
	public String departmentName() {
		dep.setDepartmentName("Welcome to Admin Department");
		return dep.getDepartmentName();
	}

	public String getTodaysWork() {
		dep.setGetTodaysWork("Complete your documents Submission");
		return dep.getGetTodaysWork();
	}
	
	public String getWorkDeadline() {
		dep.setGetWorkDeadline("Complete by EOD");
		return dep.getGetWorkDeadline();
	}

}
