package com.deloitte.training.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapForStudent {

	public static void main(String[] args) {
		Map<Integer,StudentInfo> hmap = new HashMap<Integer,StudentInfo>();
		hmap.put(34, new StudentInfo("Ani"));
		hmap.put(23, new StudentInfo("Suresh"));
		hmap.put(67, new StudentInfo("Ramesh"));
		hmap.put(63, new StudentInfo("Venkat"));
		Set<Entry<Integer, StudentInfo>> entry = hmap.entrySet();
		for(Entry<Integer,StudentInfo> value:entry)
			System.out.println(value.getKey()+" "+value.getValue().sName);
		Collection<StudentInfo> values = hmap.values();
		for(StudentInfo a:values)
			System.out.println(a.sName);
		hmap.remove(1);
		System.out.println(hmap.get(1));
		
		
		System.out.println("*************************");
		
		Map<StudentInfo,Integer> hmap2 = new TreeMap<>();
		hmap2.put(new StudentInfo("Ani"),34);
		hmap2.put(new StudentInfo("Suresh"),23);
		hmap2.put(new StudentInfo("Ramesh"),67);
		hmap2.put(new StudentInfo("Venkat"),63);
		Set<Entry<StudentInfo,Integer>> entry2 = hmap2.entrySet();
		for(Entry<StudentInfo,Integer> a:entry2)
			System.out.println(a.getKey().sName +" " +a.getValue());
		
		
	}

}
