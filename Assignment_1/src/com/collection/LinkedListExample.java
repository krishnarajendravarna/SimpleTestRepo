package com.collection;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(1);
		li.add(5);
		li.add(1, 8);
		li.add(4);

		System.out.println("LinkedList Element:" + li);

	}
}
