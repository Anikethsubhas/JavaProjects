package com.deloitte.training.basic;

public class StringExample {

	public static void main(String[] args) {
//		String string1 = new String("Deloitte Consulting");
//		String string2 = new String("DeLoitte Consulting");
//		System.out.println(string1.equals(string2));//casing
//		System.out.println(string1.equalsIgnoreCase(string2));//ignore casing
		
//		String string1 = "DTA Launcpad";
//		String string2 = "A La";
//		System.out.println(string1.contains(string2));
		
//		String string1= "Happy Diwali 2022";
//		String string2[] = string1.split(" ");
//		for(String a:string2) {
//			if(a.equals("Diwali"))
//				System.out.println("verified");
//		}
		
		String str1 = "The price of Pizza is Rs.200.89 and the price of Coke is Rs.68.88";
		String components[] = str1.split("Rs.");
		String arra1[] = components[1].split(" ");
		String pizzaPrice = arra1[0];
		Double pizza = Double.parseDouble(pizzaPrice);
		String cokePrice = components[2];
		Double coke = Double.parseDouble(cokePrice);
		double sum = 0;
		sum = pizza + coke;
		System.out.println(pizza);
		System.out.println(coke);
		System.out.println(sum);
		

//		
//		String string1 = "true";
//		boolean flag =Boolean.parseBoolean(string1);
//		if (flag)
//			System.out.println("I am Happy");
//		else
//			System.out.println("I am Sad");
//		
//		if (string1.equals("true"))
//			System.out.println("I am Happy");
//		else
//			System.out.println("I am Sad");
		
//		String sentance = "Java is a pre-requisite for Selenium";
//		String words[] = sentance.split("");
//		int count = 0;
//		for(String a:words)
//			if(a.equals("i"))
//				count++;
//		System.out.println(count);
				
//		String Id = "5007g00000DRw91AAD";
//		String currenturl = "https://ucbpharmausahc--sit2.sandbox.lightinh.force.com/lightinh/r/MemberPlan/0Sq7g0000004HBJCA2/view?ws=%2Flightning%2FCase%2F5007g00000DRw5UAAT%2Fview";
//		String components[] = currenturl.split("/");
//		String newurl = components[0].concat("//").concat(components[2].concat("/").concat(Id));
//		System.out.println(newurl);

		
	}

}
