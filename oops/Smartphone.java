package com.deloitte.training.oops;

public class Smartphone {
	String brand;
	String model;
	int storage;
	double price;
	
	public Smartphone(String brand,String model,int storage,double price) {
		this.brand = brand;
		this.model = model;
		this.storage = storage;
		this.price = price;
	}
	public Smartphone() {
		brand = "Unknown";
		model = "Unknown";
		storage = 0;
		price = 0.0;
	}
	public Smartphone(String brand,String model) {
		this.brand = brand;
		this.model = model;
		this.storage = 128;
		this.price = 10000;
	}
	public void displayDetail() {
		System.out.println(brand+" "+model+" "+storage+" "+price);
	}
	public static void main(String[] args) {
		Smartphone phone1 = new Smartphone("Redmi","note 4");
		phone1.displayDetail();
			
	}
}
