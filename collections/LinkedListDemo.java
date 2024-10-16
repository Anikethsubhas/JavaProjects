package com.deloitte.training.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> listOfName = new LinkedList<>();
		listOfName.add("A");
		listOfName.add("B");
		listOfName.add("C");
		Iterator<String> it = listOfName.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		listOfName.addFirst("Z");
		System.out.println(listOfName);
		System.out.println(listOfName.indexOf("C"));
		
		LinkedList<StudentInfo> sList = new LinkedList<>();
		sList.add(new StudentInfo(54,"Suresh"));
		sList.add(new StudentInfo(56,"Ramesh"));
		
		Iterator<StudentInfo> sit = sList.iterator();
		while(sit.hasNext()) {
			StudentInfo sample = sit.next();
			sample.printStream();
			System.out.println(sample.streamName);
			System.out.println(sample.sId);
		}
			
	}

}
