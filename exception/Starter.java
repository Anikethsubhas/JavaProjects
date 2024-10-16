package com.deloitte.training.tests;

import java.util.HashMap;
import java.util.Map.Entry;



import java.util.Set;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Student> map = new HashMap<>();
		map.put(1,new Student("Liam",13,"Hyderabad","Guitar"));
		map.put(2, new Student("John",6,"Bengaluru","Guitar","Keyboard"));
		map.put(3, new Student("Olivia",5,"Mumbai","Guitar","Keyboard","Music"));
		map.put(4, new Student("David",12,"Kolkata","Music"));
		map.put(5, new Student("Sarah",6,"Chennai","Dance"));
		map.put(6, new Student("Michael",8,"Hyderabad","Guitar","Dance"));
		map.put(7, new Student("Emily",11,"Bengaluru","Music","Dance"));
		Set<Entry<Integer, Student>> entries = map.entrySet();
		for(Entry<Integer,Student> value:entries) {
			if(value.getValue().getCourse().contains("Guitar"))
				System.out.println(value.getKey());
		}
		
		for(Entry<Integer,Student> value:entries) {
			if(value.getValue().getLocation().equals("Bengaluru")&&value.getValue().getAge()>10)
				System.out.println(value.getValue().getName());
		}
		
		for(Entry<Integer,Student> value:entries) {
			if(value.getValue().getCourse().size()>2)
				System.out.println(value.getKey()+" "+ value.getValue().getName());
		}

	}

}
