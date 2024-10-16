package com.deloitte.training.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,35,27,32,8,88,35));
		System.out.println(list.stream().filter((t)->t%2==0).count());//to count it returns a long type
		List<Integer> list2 = list.stream().filter((t)->t%2==0).collect(Collectors.toList());//to create a new lsit after filtering 
		
		System.out.println(list2);
		list.stream().forEach((t)->System.out.println(t+1));
		List<Integer> list3=list.stream().filter((t)->(t%10==8)).map((t)->t+2).collect(Collectors.toList());
		System.out.println(list3);
//		Predicate<Integer> pr = new Predicate<>() {
//			@Override
//			boolean test(Integer t) {
//				return t%2==0;
//			}
//		};
		List<Integer> l1= list.stream().distinct().collect(Collectors.toList());
		Set<Integer> s1 = list.stream().collect(Collectors.toSet());
		System.out.println(s1);
		List<Integer> l2=list.stream().dropWhile((t)->t!=8).collect(Collectors.toList());
		System.out.println(l2);
		
		
		Vector<String> name = new Vector<>(Arrays.asList("ANiket","Deloitte","Java","Bangalore"));
		name.stream().filter((t)->t.startsWith("A")).forEach((t)->System.out.println(t));
		name.stream().filter((t)->t.endsWith("e")).forEach((t)->System.out.println(t));
		name.stream().filter((t)->t.length())
	}
}
