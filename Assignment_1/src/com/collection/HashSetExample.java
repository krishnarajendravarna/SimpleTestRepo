package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> h = new HashSet<String>();
		
		h.add("January");
		h.add("Sunday");
		h.add("Java");
		h.add("Monday");
		h.add("HashSet");
		
		Iterator<String> itr = h.iterator();
		System.out.println("HashSet elements are:");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("In a HashSet Sunday is present:"+h.contains("Sunday"));
		
		
	}
}
