package com.deloitte.training.basic;

public class ExampleArrayPrograms {

	public static void main(String[] args) {
//		
//		int matrix[][] = {
//				{1,2,3},
//				{4,5,6}
//		};
//		int sum=0;
//		for(int row[]:matrix) {
//			for(int elements:row) {
//				sum+=elements;
//			}
//		}
//		System.out.println(sum);
//		System.out.println("************************");
		
		char array[][] = {
				{'A','B'},
				{'C','D'},
				{'E','F'}
		};
		char array2[][]=new char[2][3];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				array2[j][i]=array[i][j];
			}
		}
		
		for(char row[]:array2) {
			for(char elements:row)
				System.out.println(elements);
		}
		System.out.println("************************");
		int table1[][]= {
				{1,1,3},
				{3,4,5}
		};
		int table2[][]= {
				{1,1,2},
				{4,4,5}
		};
		boolean table3[][]=new boolean[2][3];
		for (int i=0;i<table1.length;i++) {
			for(int j=0;j<table1[0].length;j++) {
				if(table1[i][j]==table2[i][j])
					table3[i][j]=true;
				else
					table3[i][j]=false;
			}
		}
		for(boolean row[]:table3) {
			for(boolean elements:row) {
				System.out.println(elements);
			}
			}
	}

}
