package com.deloitte.training.collections;

public class Calculator {
	int a,b;
	public Calculator(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public void sum() {
		System.out.println("sum is "+a+b);
	}
	public void sub() {
		int sub = a-b;
		System.out.println("Substracted value is "+ sub);
	}
}
