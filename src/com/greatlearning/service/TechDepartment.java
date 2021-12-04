package com.greatlearning.service;

import com.greatlearning.model.Department;

public class TechDepartment extends SuperDepartment {
	Department dep = new Department();
	public String departmentName() {
		dep.setDepartmentName("Welcome to Tech Department");
        return dep.getDepartmentName();
	}
	
	public String getTodaysWork() {
		dep.setGetTodaysWork("Complete coding of module 1");
		return dep.getGetTodaysWork();
	}
	
	public String getWorkDeadline() {
		dep.setGetWorkDeadline("Complete by EOD");
		return dep.getGetWorkDeadline();
	}

	public String getTechStackInformation () {
		dep.setGetTechStackInformation("Core Java");
		return dep.getGetTechStackInformation();
	}

}
