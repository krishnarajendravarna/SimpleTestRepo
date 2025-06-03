package com.exception;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			int b = 42 / 0;
			System.out.println("Result:"+b);
			int c[] = { 1 };
			c[42] = 99;
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: " + e.getMessage());
		}
	}
}
