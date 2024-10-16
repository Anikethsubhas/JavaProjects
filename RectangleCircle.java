package com.deloitte.training.basic;

public class RectangleCircle {

	public static void main(String[] args) {
		float length = 50;
		float breadth = 25;
		
		float area = length * breadth;
		float perimeter = 2*(length+breadth);
		
		System.out.println("Area of rectangle is "+ area);
		System.out.println("Perimeter of rectangle is "+ perimeter);
		System.out.println("Area of Circle is "+ 3.14*perimeter*perimeter);

	}

}
