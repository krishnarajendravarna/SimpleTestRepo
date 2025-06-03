package com.collection;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("RCB");
		pq.add("CSK");
		pq.add("MI");
		pq.add("PBKS");
		pq.add("DC");
		
		for(String s:pq) {
			System.out.println(s);
		}
		
		System.out.println("Adding element:"+pq.add("DFG"));
		
		for(String s:pq) {
			System.out.println(s);
		}
		
		System.out.println("Removing element:"+pq.poll());
		
		for(String s:pq) {
			System.out.println(s);
		}
	}

}
