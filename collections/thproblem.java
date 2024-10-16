package com.deloitte.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class thproblem {

	public static void main(String[] args) {
		ArrayList<CustomerInfo> customers = new ArrayList<>();
		customers.add(new CustomerInfo("Ani",23,"Salad",5));
		customers.add(new CustomerInfo("John", 45, "Pizza", 12));
		customers.add(new CustomerInfo("Sophia", 37, "Pasta", 18));
		customers.add(new CustomerInfo("Emily", 29, "Burger", 22));
		customers.add(new CustomerInfo("David", 51, "Sushi", 7));
		customers.add(new CustomerInfo("Emma", 34, "Ice Cream", 3));
		customers.add(new CustomerInfo("Oliver", 62, "Sandwich", 9));
		customers.add(new CustomerInfo("Liam", 48, "Steak", 15));
		customers.add(new CustomerInfo("Isabella", 27, "Pancakes", 25));
		customers.add(new CustomerInfo("Mason", 53, "Coffee", 13));
		customers.add(new CustomerInfo("Mia", 41, "Cupcakes", 2));
		customers.add(new CustomerInfo("Noah", 59, "Tacos", 30));
		customers.add(new CustomerInfo("Ethan", 32, "Soup", 8));
		customers.add(new CustomerInfo("Ava", 26, "Fruit Salad", 6));
		customers.add(new CustomerInfo("James", 38, "Pasta", 16));
		customers.add(new CustomerInfo("Lucas", 44, "Chicken Wings", 20));
		customers.add(new CustomerInfo("Deepak Sharma", 123, "Pizza", 10));
		customers.add(new CustomerInfo("Deepak Singh", 234, "Burger", 15));
		customers.add(new CustomerInfo("Anjali Deepak", 34, "Pasta", 5));
		customers.add(new CustomerInfo("Deepak Kumar", 456, "Salad", 20));
		customers.add(new CustomerInfo("Deepak Reddy", 56, "Sushi", 30));
		int discount10 = 0;
		Iterator<CustomerInfo> it = customers.iterator();
		while(it.hasNext()) {
			CustomerInfo user = it.next();
			user.discountChecker();
			if(user.discount==10)
				discount10++;
		}
		System.out.println(discount10);
		int visit25=0;
		Iterator<CustomerInfo> it1 = customers.iterator();
		while(it1.hasNext()) {
			CustomerInfo user = it1.next();
			if(user.visitCount>25)
				visit25++;
		}
		System.out.println("There are "+visit25+" users that visit more than 25 times");
		int deepakCount = 0;
		Iterator<CustomerInfo> it2 = customers.iterator();
		while(it2.hasNext()) {
			CustomerInfo user = it2.next();
			if(user.name.contains("Deepak"))
				deepakCount++;
		}
		System.out.println("There are "+deepakCount+" names that contains Deepak");
		
		
		String mostLiked = null ;
		int mostCount=0;
		for(int i=0;i<customers.size();i++) {
			String item = customers.get(i).favItem;
			int count = 1;
			for(int j=i+1;j<customers.size();j++) {
				if(item.equals(customers.get(j).favItem))
						count++;
			}
			if(count>mostCount) {
				mostCount=count;
				mostLiked = item;
			}
				
				
		}
		System.out.println(mostLiked);
//		Function<CustomerInfo,Integer> fn=new Function<CustomerInfo,Integer>(){
//
//			
//			@Override
//			public Integer apply(CustomerInfo t) {
//				// TODO Auto-generated method stub
//				t.discountChecker();
//				return t.discount;
//			}
//
//		
//			
//		};
		System.out.println(customers.stream().filter((t)->t.discount==10).count());		
		System.out.println(customers.stream().filter((t)->t.visitCount>25).count());
		System.out.println(customers.stream().filter((t)->t.name.contains("Deepak")).count());
//		System.out.println(customers.stream().map((t)->t.favItem).distinct().collect(Collectors.toList()));	
		List<String> items = customers.stream().map((t)->t.favItem).collect(Collectors.toList());
		System.out.println(items);
		long maxcount =0;
		String fav = null;
		for(String k:items) {
			long count =customers.stream().filter((t)->t.favItem.equals(k)).count();
			if (count>maxcount){
				maxcount=count;
				fav = k;
			}
			
		}
		System.out.println(fav);
	}

}
