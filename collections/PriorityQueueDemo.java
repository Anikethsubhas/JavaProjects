package com.deloitte.training.collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue = new PriorityQueue<>();
//		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); to change the priority oorder
		queue.offer(12);
		queue.offer(1);
		queue.offer(99);
		queue.offer(23);
		queue.offer(9);
		System.out.println(queue);//no order but the first element has more priority
		
		System.out.println(queue.peek());
//		queue.poll();
//		queue.poll();
		System.out.println(queue);
		for(Integer a:queue)
			System.out.println(a);
		System.out.println("********************");
		while(!queue.isEmpty())
			System.out.println(queue.poll());
		
		ArrayDeque<String> words = new ArrayDeque<>();
		words.offer("aniketh");
		words.offerFirst("Sam");
		words.offerLast("INsertion");
		words.poll();
		System.out.println(words);
		//PERFORM USER DEFINED CLASS AS GENERIC TYPE IN PRIORITY QUEUE USE COMPARATOR
		
	}

}
