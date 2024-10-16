package com.deloitte.training.java8;

public class Classone implements Classtwo,Classthree{

	@Override
	public void method() {
		// TODO Auto-generated method stub
//		System.out.println("Classone default method");
		Classtwo.super.method();
	}
	
}	
