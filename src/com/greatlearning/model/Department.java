package com.greatlearning.model;

public class Department {
	
	private String departmentName ;
	private String getTodaysWork ;
	private String getWorkDeadline;
	private String isTodayAHoliday;
	private String doActivity;
	private String getTechStackInformation;
	
	public Department() {

	}

	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getGetTodaysWork() {
		return getTodaysWork;
	}


	public void setGetTodaysWork(String getTodaysWork) {
		this.getTodaysWork = getTodaysWork;
	}


	public String getGetWorkDeadline() {
		return getWorkDeadline;
	}


	public void setGetWorkDeadline(String getWorkDeadline) {
		this.getWorkDeadline = getWorkDeadline;
	}


	public String getIsTodayAHoliday() {
		return isTodayAHoliday;
	}


	public void setIsTodayAHoliday(String isTodayAHoliday) {
		this.isTodayAHoliday = isTodayAHoliday;
	}

	public String getDoActivity() {
		return doActivity;
	}

	public void setDoActivity(String doActivity) {
		this.doActivity = doActivity;
	}

	public String getGetTechStackInformation() {
		return getTechStackInformation;
	}

	public void setGetTechStackInformation(String getTechStackInformation) {
		this.getTechStackInformation = getTechStackInformation;
	}


}
