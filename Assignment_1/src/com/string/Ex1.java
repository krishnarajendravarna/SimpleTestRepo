package com.string;

public class Ex1 {
	public String nameLower(String str) {
		return str.toLowerCase();
	}
	public static void main(String args[]) {
		Ex1 ob = new Ex1();
		String name = "Krishna";
		System.out.println("Name:"+ob.nameLower(name));
	}
}
