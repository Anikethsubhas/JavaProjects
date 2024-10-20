package com.deloitte.training.oops;

public class ExtendCompleteSorting extends CompleteSorting{
	public ExtendCompleteSorting() {
		
	}
	public ExtendCompleteSorting(int a,int b,int c,int d) {
		super(a,b,c,d);
	}
	@Override
	public int Leastoftwo() {
		System.out.println("New logic");
		return 0;
	}
}
