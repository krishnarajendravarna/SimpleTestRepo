package com.oop.example;

interface Addition{
	int add(int a,int b);
}

interface Subtraction{
	int sub(int a,int c);

}

class InterfaceClass implements Addition,Subtraction{
	@Override
	public int add(int a,int b) {
		return a + b;
	}
	@Override
	public int sub(int a,int c) {
		return a - c;
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		InterfaceClass obj = new InterfaceClass();
		System.out.println("Addition result:"+obj.add(34, -89));
		System.out.println("Subtraction result:"+obj.sub(34, -89));
		
	}
}
