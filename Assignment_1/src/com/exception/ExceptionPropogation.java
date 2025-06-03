package com.exception;

public class ExceptionPropogation {
	
	static void methodA() {
		int res = 35 / 0;
	}
	
	static void methodB() {
		methodA();
	}
	
	static void methodC() {
		try {
			methodB();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		methodC();
	}

}
