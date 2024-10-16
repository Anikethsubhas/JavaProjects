package com.deloitte.training.basic;

public class City {

	public static void main(String[] args) {
		int totalPopulation = 156000;
		int mensPopulation = (totalPopulation/100)*50;
		System.out.println("Mens Population is "+ mensPopulation);
		
		int womensPopulation = (mensPopulation/100)*70;
		int kidsPopulation = (mensPopulation/100)*30;
		
		System.out.println("Womens Population is "+ womensPopulation);
		System.out.println("Kids Population is "+ kidsPopulation);
		
		int kidsPercentage = (kidsPopulation*100)/totalPopulation;
		System.out.println("Kids Population is "+ kidsPercentage);
		

	}

}
