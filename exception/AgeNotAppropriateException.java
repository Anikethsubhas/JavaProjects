package com.deloitte.training.tests;

public class  AgeNotAppropriateException extends RuntimeException{
	@Override
	public String getMessage() {
		return "The age for highschool tudent must be above 14";
		
	}
}
