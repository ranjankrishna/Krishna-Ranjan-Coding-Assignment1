package com.greatlearning.service;

import com.greatlearning.model.Department;

public class SuperDepartment {
	Department dep = new Department();
	public String departmentName() {
		dep.setDepartmentName("Welcome to Super Department");
		return dep.getDepartmentName();
	}
	
	public String getTodaysWork() {
		dep.setGetTodaysWork("No Work as of now");
		return dep.getGetTodaysWork();
	}
	
	public String getWorkDeadline() {
		dep.setGetWorkDeadline("Nil");
		return dep.getGetWorkDeadline();
	}
	
	public String isTodayAHoliday () {
		dep.setIsTodayAHoliday("Today is not a holiday");
		return dep.getIsTodayAHoliday();
	}
}
