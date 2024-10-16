package com.deloitte.training.collections;

import java.util.ArrayList;

public class Starter {

	public static void main(String[] args) {
		ArrayList<Student> obj = new ArrayList<>();
		obj.add(new Student(1, "John Doe"));
        obj.add(new Student(2, "Jane Smith"));
        obj.add(new Student(3, "Mark Taylor"));
        obj.add(new Student(4, "Emily Davis"));
        obj.add(new Student(5, "Michael Johnson"));
        System.out.println(obj.equals(obj));
		
	}

}
