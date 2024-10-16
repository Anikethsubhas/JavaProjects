package com.deloitte.training.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetdemo {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
//		LinkedHashSet<Integer> set = new LinkedHashSet<>()
		set.add(1);
		set.add(65);
		set.add(1346);
		set.add(3567);
		set.add(534);
		set.add(6);
		for(Integer a:set)
			System.out.println(a);
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		s
	}

}
