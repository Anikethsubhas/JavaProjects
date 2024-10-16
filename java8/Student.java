package com.deloitte.training.java8;

import java.util.Objects;

public class Student {
	//encapsulation of variable and using getters and setters to initialise and get hte stored value
	private int sId;
	private String sName;
	public Student(int sId,String sname) {
		setsId(sId);
		setsName(sname);
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return  sId + " " + sName ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sId, sName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return sId == other.sId && Objects.equals(sName, other.sName);
	}
	
	
}
