package com.deloitte.training.oops;

public abstract class PartialSorting implements SortingInterface{
	int a,b;
	public  PartialSorting() {
		
	}
	public PartialSorting(int a,int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public int Leastoftwo() {
		if (a>b)
			System.out.println(b);
		else
			System.out.println(a);
		return 0;
		}
	
}
