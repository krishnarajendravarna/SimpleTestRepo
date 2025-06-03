package com.collection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}
}

public class ComparableExample {
	public static void main(String[] args) {
		ArrayList<Student> stud = new ArrayList<Student>();
		stud.add(new Student("Krishna", 23));
		stud.add(new Student("Raj", 35));
		stud.add(new Student("Mohan", 12));
		stud.add(new Student("Lohith", 18));
		stud.add(new Student("Manoj", 21));

		Collections.sort(stud);

		System.out.println("Sorted Student:" + stud);

	}
}
