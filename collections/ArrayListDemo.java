package com.deloitte.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<StudentInfo> al1 = new ArrayList<StudentInfo>();
		StudentInfo s1 = new StudentInfo(12,"Aniketh");
		al1.add(s1);
		al1.add(new StudentInfo(11,"Suresh"));
		Iterator<StudentInfo> it = al1.iterator();
		while(it.hasNext()) {
			StudentInfo sample = it.next();
			System.out.println(sample.sId);
			sample.printStream();
			System.out.println(sample.streamName);
		}
		
		ArrayList<Integer> numlist = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
	
		numlist.add(3, 33);
//		System.out.println(numlist);
//		System.out.println(numlist.getClass());
		numlist.removeFirst();
//		System.out.println(numlist);
		Iterator<Integer> numit = numlist.iterator();
		while(numit.hasNext()) {
			System.out.println(numit.next());
		}
		
	}

}
