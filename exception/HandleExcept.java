package com.deloitte.training.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandleExcept {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		try {
			throw new ArithmeticException();
//			arr[5] = 12;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally block");
		}
		File file = new File("D:\\comp.txt");
		FileReader fr = new FileReader(file);
	}

}
