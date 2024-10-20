package com.deloitte.training.oops;

public class Method {
	public static void main(String[] args) {
		studentInfo(2,"Aniketh");
		System.out.println(sum(12,20));
		System.out.println(sum(4.3,234.67));
	
	}
	public static void studentInfo(int rollNo,String name) {
		System.out.println("Name " +name +" RollNo "+rollNo);
	}
	public static int sum(int a,int b) {
		return a+b;
	}
	public static double sum(double a,double b) {
		return a+b;
	}
	

}
