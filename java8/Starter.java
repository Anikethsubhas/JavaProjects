package com.deloitte.training.java8;

public class Starter {

	public static void main(String[] args) {
//		Classone cl1 = new Classone();
//		cl1.method();
		
//		FunctionalInterfaceDemo fn = new FunctionalInterfaceDemo() {
//
//			@Override
//			public void printer() {
//				// TODO Auto-generated method stub
//				System.out.println("Method implementation without lamda");
//				
//			}
//			
//		};
		
//		FunctionalInterfaceDemo fn = ()->{
//			System.out.println("method with lamda expression");
//		};
//		FunctionalInterfaceDemo fn =(a,b)->{System.out.println(a+b);};
//		fn.add(2,3);
//		FunctionalInterfaceDemo fn = (a,b)->  a+b;// return happens here
//		System.out.println(fn.add(12, 32));
//		FunctionalInterfaceDemo fn = ()->"hello there ";
//		System.out.println(fn.sayHello());
		
//		FunctionalInterfaceDemo fn = (a)->System.out.println("hello "+a);
//		fn.methodone("Aniekth");
		
//		FunctionalInterfaceDemo fn = (a,b)->System.out.println("Hello "+a+" with age "+b);
//		fn.methodtwo("Aniketh",21);
		
		FunctionalInterfaceDemo fn =(a)->a.length();
		System.out.println(fn.lenght("aniekth"));
		  
	}

}
