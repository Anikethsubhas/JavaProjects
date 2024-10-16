package com.deloitte.training.basic;

public class MultiArray {

	public static void main(String[] args) {
//		int matrix[][]=new int[3][3];
//		matrix[0][0] = 10;
//		matrix[0][1] = 20;
//		matrix[0][2] = 30;
//		matrix[1][0] = 40;
//		matrix[1][1] = 50;
//		matrix[1][2] = 60;
//		matrix[2][0] = 70;
//		matrix[2][1] = 80;
//		matrix[2][2] = 90;
//		for (int i =0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.println(matrix[i][j]);
//			}
//		}
//		System.out.println(matrix.length);
//		System.out.println(matrix[0].length);
//		for (int row[] :matrix) {
//			 for(int elements:row) {
//				 System.out.println(elements);
//			 }
//		}
//		
//		char wordMatrix[][] = {{'A', 'B', 'C'},{'D', 'E', 'F'}};
//	
//		
//		for(char row[]:wordMatrix) {
//			for(char columnData:row)
//				System.out.println(columnData);
//		}
//		System.out.println("***************");
		
		int jarray[][] = new int[3][];
		jarray[0] = new int[1];
		jarray[1] = new int[2];
		jarray[2] = new int[3];
		int jarray[][] = {{1},{2,3},{4,5,6}};
//		jarray[0][0] = 1;
//		jarray[1][0] = 2;
//		jarray[1][1] = 3;
//		jarray[2][0] = 4;
//		jarray[2][1] = 5;
//		jarray[2][2] = 6;
		for(int row[]:jarray) {
			for(int elements:row)
				System.out.println(elements);
		}
		
		
	}

}
