package com.deloitte.training.collections;

public class StudentInfo implements Comparable<StudentInfo>{
	
	String sName;
	public StudentInfo(String sName) {

		this.sName = sName;
	}
	public void printDetail() {
		System.out.println(sName);
	}
	@Override
	public int compareTo(StudentInfo o) {
		// TODO Auto-generated method stub
		return o.sName.compareTo(this.sName);
	}
	
}
