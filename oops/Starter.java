package com.deloitte.training.oops;

public class Starter {
	public static void main(String[] args) {
//		SortingInterface obj1 = new CompleteSorting();
//		PartialSorting obj2 = new CompleteSorting();
		CompleteSorting obj3 = new CompleteSorting(12,23,56,3);
		obj3.Leastofthree();
		obj3.Leastoffour();
		obj3.Leastoftwo();
		ExtendCompleteSorting obj4 = new ExtendCompleteSorting(12,4,3,43);
		obj4.Leastoftwo();
		SortingInterface obj5 = new ExtendCompleteSorting();
		obj5.Leastoftwo();
			
}
