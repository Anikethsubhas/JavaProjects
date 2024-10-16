package com.deloitte.training.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserDefinedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentinfo = new ArrayList<Student>() ;
		studentinfo.add(new Student(1,"aniketh Subhas"));
		studentinfo.add(new Student(34,"java"));
		studentinfo.add(new Student(5,"Bangalore"));
		studentinfo.add(new Student(3,"Usi"));
		studentinfo.add(new Student(6,"Deloitte"));
		studentinfo.add(new Student(35,"Anitha Subhas"));
		
		System.out.println(studentinfo.stream().filter((t)->t.getsId()>3).count());
		boolean matchfinder=studentinfo.stream().allMatch((t)->t.getsName().contains("Subhas"));
		System.out.println(matchfinder);
		studentinfo.stream().filter((t)->t.getsName().endsWith("Subhas")).forEach((t)->System.out.println(t.getsName().replace("Subhas", "S")));
		
		List<Student> l1=studentinfo.stream().dropWhile((t)->t.getsId()!=5).collect(Collectors.toList());
		System.out.println(l1);
		List<Student> l2= studentinfo.stream().takeWhile((t)->t.getsId()!=5).collect(Collectors.toList());
		System.out.println(l2);
		

	}

}
