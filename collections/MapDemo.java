package com.deloitte.training.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap = new HashMap<>();
		hmap.put(1, "a");
		hmap.put(2, "b");
		hmap.put(3, "c");
		hmap.put(4, "d");
		hmap.put(5, "e");
		hmap.put(6, "f");
		System.out.println(hmap.get(4));
		Set<Integer> kset = hmap.keySet();
		for(Integer a:kset)
			System.out.println(hmap.get(a));
		
		Collection<String> value = hmap.values();
		Set<Entry<Integer, String>> entries = hmap.entrySet();
		for(Entry<Integer,String> a:entries) {
//			System.out.println(a);
			System.out.println(a.getKey()+" "+a.getValue());
		}
		//update value
		hmap.put(3, "C");
		System.out.println(hmap.get(3));
		hmap.putIfAbsent(3, "w");
		System.out.println(hmap.get(3));
		//delete
		hmap.remove(3);
		System.out.println(hmap.get(3));
		
	}

}
