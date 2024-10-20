package com.deloitte.training.oops;

public class CompleteSorting extends PartialSorting{
	int c,d;
	public CompleteSorting(int a,int b,int c,int d) {
		super(a,b);
		this.c = c;
		this.d = d;
		
	}
	public CompleteSorting() {
		
	}
	

	@Override
	public int Leastofthree() {
	    if (a < b && a < c) {
	        System.out.println(a);
	        
	    } else if (b < c) {
	        System.out.println(b);
	        
	    } else {
	        System.out.println(c);
	        
	    }
	    return 0;
	}

	@Override
	public int Leastoffour() {
		 if (a < b && a < c && a < d) {
		        System.out.println(a);
		    } else if (b < c && b < d) {
		        System.out.println(b);
		    } else if (c < d) {
		        System.out.println(c);
		    } else {
		        System.out.println(d);
		    }
		 return 0;
	}
	public void Maxoftwo() {
		if (a>b)
			System.out.println(a);
		else 
			System.out.println(b);
	}
	

}
