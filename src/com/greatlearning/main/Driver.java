package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.service.*;

public class Driver {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to Department Home Page");
		System.out.println("1. Admin Department");
		System.out.println("2. Tech Department");
		System.out.println("3. Human Resource");
		System.out.println("Choose the Department you like to access");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: AdminDepartment admindep = new AdminDepartment();
					String departmentName = admindep.departmentName();
					System.out.println(departmentName);
					String getTodaysWork = admindep.getTodaysWork();
					System.out.println(getTodaysWork);
					String getWorkDeadline = admindep.getWorkDeadline();
					System.out.println(getWorkDeadline);
					String isTodayAHoliday = admindep.isTodayAHoliday();
					System.out.println(isTodayAHoliday);
				break;
			
		case 2: TechDepartment techdep = new TechDepartment();
					departmentName = techdep.departmentName();
					System.out.println(departmentName);
					getTodaysWork = techdep.getTodaysWork();
					System.out.println(getTodaysWork);
					getWorkDeadline = techdep.getWorkDeadline();
					System.out.println(getWorkDeadline);
					String getTechStackInformation = techdep.getTechStackInformation();
					System.out.println(getTechStackInformation);
					isTodayAHoliday = techdep.isTodayAHoliday();
					System.out.println(isTodayAHoliday);
				break;
		
		case 3: HrDepartment hrdep = new HrDepartment();
					departmentName = hrdep.departmentName();
					System.out.println(departmentName);
					String doActivity = hrdep.doActivity();
					System.out.println(doActivity);
					getTodaysWork = hrdep.getTodaysWork();
					System.out.println(getTodaysWork);
					getWorkDeadline = hrdep.getWorkDeadline();
					System.out.println(getWorkDeadline);
					isTodayAHoliday = hrdep.isTodayAHoliday();
					System.out.println(isTodayAHoliday);
				break;
			
	    default: System.out.println("Wrong Choice");
			return; 		
		}
		
		}
	}
	