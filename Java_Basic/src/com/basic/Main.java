package com.basic;

class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

}

public class Main {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		int num1 = 10, num2 = 5;

		System.out.println("Addition: " + calc.add(num1, num2));
		System.out.println("Subtraction: " + calc.subtract(num1, num2));
	}
}
