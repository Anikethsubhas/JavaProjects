package com.deloitte.training.oops;

public class EmployeeInfo {
	int empId;
	String empName;
	double salary;
	String city;
	static String teamName= "java";
	
	public void printInfo() {
		System.out.println(empName+'-'+empId);
		System.out.println("Team="+teamName);
	}
}
