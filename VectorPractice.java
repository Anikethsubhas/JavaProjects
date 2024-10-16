package com.deloitte.training.basic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class VectorPractice {

	

	public static void main(String[] args) {
		Vector v1 = new Vector();
		Vector arr = new Vector(Arrays.asList(1,2,3,4));
		Vector v2 = new Vector();
		v2.add("a");
		v2.add("b");
		v1.add(1);
		v1.add(arr);
		System.out.println(v1);
		v1.addAll(1,v2);
		System.out.println(v1);
		v1.remove(0);
		System.out.println(v1);
		v1.removeAll(v2);
		System.out.println(v1);
		v1.add(2);
		v1.set(1, "new element");
		System.out.println(v1);
		Iterator it = arr.iterator();
		while(it.hasNext())
			System.out.print(it.next());
		
	}

}
