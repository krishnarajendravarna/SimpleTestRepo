package com.exception;

public class Example1 {
	public int division(int a,int b) {
		if(b == 0) {
			throw new ArithmeticException("Divisor must be greater than 0");
		}
		return a/b;
	}
	
	public static void main(String[] args) {
		Example1 obj = new Example1();
		try {
			int res = obj.division(24,2);
			System.out.println("Result:"+res);
		}catch(ArithmeticException e) {
			System.out.println("Exception:"+e.getMessage());
		}
	}
}
