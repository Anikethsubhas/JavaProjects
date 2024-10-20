package com.deloitte.training.oops;

public class NewHousePlan extends HousePlan{
	int roomCnt;
	
	public NewHousePlan(double plotArea,double carpetArea,int windowCnt,int roomCnt) {
		super(plotArea,carpetArea,windowCnt);
		this.roomCnt = roomCnt;
	}
	public NewHousePlan() {
		System.out.println("Child ");
	}

	public static void main(String[] args) {
		NewHousePlan nhouse1 = new NewHousePlan(120,200,7,2);
		nhouse1.determineColour();
		nhouse1.determineFlooring();
		System.out.println(nhouse1.roomCnt);
		System.out.println(nhouse1.areaCode);
		NewHousePlan nhouse2= new NewHousePlan();

	}
}
