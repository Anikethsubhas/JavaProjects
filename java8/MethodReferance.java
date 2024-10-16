package com.deloitte.training.java8;

public class MethodReferance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReferInterface obj = (a,b)->new Student(a,b);
		Student o=obj.name(1,"ani");
		System.out.println(o);
		//watch some yputube or hit this is ass
		
		

	}

}
