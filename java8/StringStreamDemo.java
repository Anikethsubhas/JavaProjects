package com.deloitte.training.java8;


import java.util.Arrays;

import java.util.Vector;

public class StringStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> name = new Vector<>(Arrays.asList("ANiket","Deloitte","Java","Bangalore"));
		name.stream().filter((t)->t.startsWith("A")).forEach((t)->System.out.println(t));
		name.stream().filter((t)->t.endsWith("e")).forEach((t)->System.out.println(t));
		name.stream().filter((t)->t.length()==6).forEach((t)->System.out.println(t));
		name.stream().filter((t)->t.equals("Deloitte")).forEach((t)->System.out.println(t));
		long l = name.stream().filter((t)->t.endsWith("e")).count();
		System.out.println(l+" return the count of element in the stream after filter");
		
		
	}

}
