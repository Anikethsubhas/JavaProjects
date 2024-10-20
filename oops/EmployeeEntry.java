package com.deloitte.training.oops;

public class EmployeeEntry {

	public static void main(String[] args) {
		EmployeeInfo emp1 = new EmployeeInfo();
		emp1.empId = 12;
		emp1.empName = "Suresh";
		emp1.printInfo();
		
		EmployeeInfo emp2 = new EmployeeInfo();
		emp2.empId = 34;
		emp2.empName = "Ramesh";
		emp2.printInfo();

	}

}
