package com.deloitte.training.tests;

import java.util.HashSet;


public class Student {
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", location=" + location + ", course=" + course + "]";
	}
	private String name;
	private int age;
	private String location;
	private HashSet<String> course = new HashSet<>();
	public Student(String name,int age,String loca,String... course) {
		setCourse(course);
		setName(name);
		setAge(age);
		setLocation(loca);
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
//		if(age<14)
//			throw new AgeNotAppropriateException();
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public HashSet<String> getCourse() {
		return course;
	}
	public void setCourse(String... course) {
		for(String c:course) {
			this.course.add(c);
		}
	}
	
	
}
