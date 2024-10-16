package com.deloitte.training.basic;

public class Array {

	public static void main(String[] args) {
//		int marks[]= new int [5];
//		marks[0]=12;
//		marks[1]=23;
//		marks[2]=2;
//		marks[3]=10;
//		for(int i=0;i<5;i++)
//			System.out.println(marks[i]);	
//		System.out.println(marks.length);
		
		double marks[] = new double[5];
		marks[0]= 123;
		marks[1]= 200;
		marks[2]= 360;
		marks[3]= 240;
		marks[4]= 5000;
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);	
		System.out.println(marks[2]);
		System.out.println(marks[3]);	
		System.out.println(marks[4]);
		
		System.out.println("*********************");
		
		for (int i= 0;i<=marks.length-1;i++)
			System.out.println(marks[i]);
		System.out.println("*********************");
		
		for(double a:marks)
			System.out.println(a);
		
		System.out.println("*********************");

		int array[]=new int[10];
		for(int x:array)
			System.out.println(x);

		

	}

}
