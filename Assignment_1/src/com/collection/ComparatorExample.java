package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student3{
	int id;
	String name;
	
	public Student3(int id,String name) {
		this.id = id;
		this.name = name;
	}
}

class SortByName implements Comparator<Student3>{
	public int compare(Student3 s1,Student3 s2) {
		return s1.name.compareTo(s2.name);
	}
}

class SortById implements Comparator<Student3>{
	public int compare(Student3 s1,Student3 s2) {
		return s1.id - s2.id;
	}
}

public class ComparatorExample {
	public static void main(String[] args) {
		ArrayList<Student3> stud = new ArrayList<Student3>();
		stud.add(new Student3(23,"Yeshwanth"));
		stud.add(new Student3(57,"Akash"));
		stud.add(new Student3(29,"Manoj"));
		stud.add(new Student3(67,"Nagraj"));
		stud.add(new Student3(34,"Kiran"));
		
		Collections.sort(stud, new SortByName());
		
		for (Student3 s : stud) {
            System.out.println(s.name + " - " + s.id);
        }
		
		//Collections.sort(stud, new SortById());
		
		/*for (Student3 s : stud) {
            System.out.println(s.name + " - " + s.id);
        }*/
		
		System.out.println("After sorting does not affect on the class");
		for (Student3 s1 : stud) {
            System.out.println(s1.name + " - " + s1.id);
        }
	}
}
