package com.deloitte.training.oops;

public class HousePlan {
	double plotArea;
	double carpetArea;
	int windowCnt;
	String paintColor;
	String flooringType;
	static int areaCode = 201;
	
	public HousePlan() {
		System.out.println("Default");
	}
	public HousePlan(double plotArea,double carpetArea,int windowCnt,String paintColor,String flooringType) {
		this(plotArea,carpetArea,windowCnt);
		this.paintColor = paintColor;
		this.flooringType = flooringType;
	}
	
	public HousePlan(double plotArea,double carpetArea,int windowCnt) {
		this.plotArea = plotArea;
		this.carpetArea = carpetArea;
		this.windowCnt = windowCnt;
	}
	
	public void determineFlooring() {
		if (plotArea>200)
			System.out.println("Marble");
		else
			System.out.println("Vitrified tile");
	}
	
	public void determineColour() {
		if (carpetArea>1000)
			System.out.println("Blue");
		else
			System.out.println("White");
	}
	
	
	
}
