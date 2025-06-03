package com.exception;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class DemoException {
	Scanner in = new Scanner(System.in);
	public void ageValidate(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("Age is must be grater than 18");
		}
		System.out.println("Age:"+age);
	}
	
	public static void main(String args[]) {
		int age = 12;
		try {
			DemoException obj = new DemoException();
			obj.ageValidate(age);
		}catch(InvalidAgeException e) {
			System.out.println("Error:"+e.getMessage());
		}
	}
}
