package com.deloitte.training.collections;

public class CustomerInfo {
	String name;
	int phoneNumber;
	String favItem;
	int visitCount;
	int discount;
	public CustomerInfo(String name,int phone,String fav,int count) {
		this.name = name;
		this.phoneNumber = phone;
		this.favItem = fav;
		this.visitCount = count;
		discountChecker();
	}
	public void discountChecker() {
		if(visitCount<5){
			discount = 5;
		}
		else if (visitCount<15)
			discount = 10;
		else if (visitCount<25)
			discount = 20;
		else if (visitCount>=25)
			discount = 30;
	}
}	
