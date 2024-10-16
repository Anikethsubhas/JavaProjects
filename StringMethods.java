package com.deloitte.training.basic;

public class StringMethods {

	public static void main(String[] args) {
		String name = new String("Aniketh");
		String name2 = new String("Subhas");
		System.out.println(name.charAt(4));
		System.out.println(name.concat(name2));
		System.out.println(name.equals(name2));
		System.out.println(name.equals("ANIKETH"));
		System.out.println(name.equalsIgnoreCase("AnikETH"));
		System.out.println(name.contains("ketvhb"));
		System.out.println(name.endsWith("th"));
		System.out.println(name.toLowerCase().startsWith("ani"));
		System.out.println(name.indexOf("a"));
		System.out.println(name.substring(3,6));
		String arr[]=name.split("e");
		for(String a:arr) {
			System.out.println(a);
		}
		System.out.println(name.compareTo(name2));
		System.out.println(name.sub);
	}

}
