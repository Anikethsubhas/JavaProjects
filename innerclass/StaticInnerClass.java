package com.deloitte.training.innerclass;

public class StaticInnerClass {
	static int outerVarialbe;
	
	public static void outer_method() {
		innerClass obj = new innerClass();
		
	}
	public class innerClass{
		int inner_value;
		public static void inner_method() {
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
