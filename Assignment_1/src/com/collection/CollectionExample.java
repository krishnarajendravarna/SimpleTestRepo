package com.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("C++");
		al.add("JavaScript");
		al.add("Python");
		al.add("Go");

		List<String> newAl = new ArrayList<String>();
		newAl.add("R");
		newAl.add("Ruby");
		newAl.add("PHP");
		newAl.add("C#");
		newAl.add("C");

		System.out.print("Elements in ArrayList are:");
		for (String i : al) {
			System.out.print(i + "\t");
		}
		System.out.println();

		al.add(0, "C");
		System.out.println("Adding element at 0th Index:" + al);

		al.addAll(3, newAl);
		System.out.println("After adding another collection:" + al);

		System.out.println("Getting element at 5th index:" + al.get(5));

		for (String i : al) {
			System.out.println("Element:" + i + "  Index:" + al.indexOf(i));
		}

		System.out.println("Removing the C in arraylist:" + al.remove(0));

		System.out.println("After removing C:" + al);

		System.out.println("Set the element at 0 th index:" + al.set(0, "COBOL"));

		System.out.println("After setting COBOL:" + al);

	}
}
