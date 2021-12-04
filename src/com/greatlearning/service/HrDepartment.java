package com.greatlearning.service;

import com.greatlearning.model.Department;

public class HrDepartment extends SuperDepartment {
	
	Department dep = new Department();
	public String departmentName() {
		dep.setDepartmentName("Welcome to Hr Department");
		return dep.getDepartmentName();
	}

	public String getTodaysWork() {
		dep.setGetTodaysWork("Fill today’s timesheet and mark your attendance");
		return dep.getGetTodaysWork();
	}
	
	public String getWorkDeadline() {
		dep.setGetWorkDeadline("Complete by EOD");
		return dep.getGetWorkDeadline();
	}
	
	public String doActivity() {
		dep.setDoActivity("Team Lunch");
		return dep.getDoActivity();
	}
}
