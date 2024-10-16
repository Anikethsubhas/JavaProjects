package com.deloitte.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class ListExcersie {

	public static void main(String[] args) {
//		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(4,5,0,9,8,10));
//		Iterator<Integer> it = num.iterator();
//		int sum=0;
//		while(it.hasNext()) {
//			sum+=it.next();
//		}
//		System.out.println("Sum is "+sum+" Average is "+sum/(num.size()));
//		
//		Vector<Integer> num1 = new Vector<>(Arrays.asList(4,5,0,9,8,10));
//		Iterator<Integer> it1 = num1.iterator();
//		int sum1 = 0;
//		while(it1.hasNext()) {
//			Integer n = it1.next();
//			if(n%2==0)
//			sum1+=n;
//		}
//		System.out.println("Sum is "+sum1);
		
//		ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(4,9,8,5,0,10));
//		System.out.println(num2.subList(0,3));
//		System.out.println(num2.subList(3,6));
		
//		ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(4,9,8));
//		ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(5,0,10));
//		num1.addAll(num2);
//		System.out.println(num1);
		
//		ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1,2,76,3,2,4,1,76,34,76));
//		ArrayList<Integer> checked = new ArrayList<>();
//		for(int i=0;i<num1.size();i++) {
//			int count =1;
//			if(!checked.contains(num1.get(i))) {
//				for(int j=i+1;j<num1.size();j++) {
//					if(num1.get(i).equals(num1.get(j)))
//						++count;
//				}
//			if(count>1)
//			System.out.println(num1.get(i)+" "+count);
//			
//			checked.add(num1.get(i));
//			}
//			
//		}
		
		ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1,2,76,3,2,4,1,76,34,76));
		
		int highestDuplicate = 0;
		int highestElement = 0;
		for(int i=0;i<num1.size();i++) {
			int count =1;
			for(int j=i+1;j<num1.size();j++) {
				if(num1.get(i).equals(num1.get(j))) {
					++count;
				}
			}
			if(count>highestDuplicate) {
				highestDuplicate = count;
				highestElement = num1.get(i);
			}
			
			
		}			
		
		System.out.println(highestElement+" with a count of "+highestDuplicate);
		
		
//		ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1,2,76,3,2,4,1,76,34,76));
//		ArrayList<Integer> setList = new ArrayList<>();
//		for(int i=0;i<num1.size();i++) {
//			if(!setList.contains(num1.get(i))) {
//				setList.add(num1.get(i));
//			}
//		}
//		System.out.println(setList);
		
	}

}
