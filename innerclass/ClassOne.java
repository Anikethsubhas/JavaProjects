package com.deloitte.training.innerclass;

public class ClassOne {
	int outer_Variable;
	
	public void outer_method() {
		innerClassone obj = new innerClassone();
		obj.inner_variable;
		obj.inner_method();
	}
	class innerClassone {
		int inner_variable;
		public void inner_method() {
			System.out.println(outer_Variable);
			outer_method();
		}
		
	}
//	class innerClasstwo{}
//	
	public static void main(String arg[]) {
		innerClassone ob = new ClassOne().new innerClassone();
		ob.inner_variable;
		ob.inner_method();
	}
}
