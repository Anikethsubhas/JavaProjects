package com.deloitte.training.innerclass;

public class LocalClassDemo {
	public void methodone() {
		class localclass{
			int a;
			public void localMethod() {
				
			}
		}
		localclass obj = new localclass();
		obj.localMethod();
		obj.a;
		
	}
//	localclass obj = new localclass();
	
}
