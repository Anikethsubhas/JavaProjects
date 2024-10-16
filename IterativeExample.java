package com.deloitte.training.basic;

public class IterativeExample {

	public static void main(String[] args) {
//		int sum = 0;
//		for (int i=300;i<500;i++) {
//			if(i%12==0)
//				sum+=i;
//		}
//		System.out.println(sum);
//		System.out.println("**********************");
		
//		for (int i=0;i<5;i++) {
//			for(int j=0;j<6;j++)
//				System.out.print("*");
//			System.out.println();
//		}
//		
//		for (int i=0;i<5;i++) {
//			for(int j=0;j<=i;j++)
//				System.out.print("*");
//			System.out.println();
//		}


//        for (int i = 1; i <=5; i++) {
//            for (int j = 1; j <= (5 - i); j++) 
//                System.out.print(" ");
//       
//            for (int k = 1; k <= i; k++) 
//                System.out.print("*");
//            
//            System.out.println(); 
//		}
//        
        for (int i=1;i<=5;i++) {
        	for(int j=i;i<=5;j++)
        		System.out.print(" ");
        	for(int k=1;k<=(2*i)-1;k++)
        		System.out.print("*");
        	System.out.println();
        }
        
	}

}
