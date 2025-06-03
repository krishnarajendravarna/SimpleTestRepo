package com.exception;

class AmountInsufficientException extends Exception{
	public AmountInsufficientException(String m) {
		super(m);
	}
}

class AmountException extends Exception{
	public AmountException(String m) {
		super(m);
	}
}

public class Example2 {
	double bal;
	
	public Example2(double bal) {
		this.bal = bal;
	}
	
	public boolean isValid(double amt) {
		return amt > 0 && amt % 100 == 0;
	}
	
	public void deposit(double amt) throws AmountException{
		if(!isValid(amt)) {
			throw new AmountException("Deposit Amount should be positive and multiplies of 100");
		}
		bal += amt;
		System.out.println(amt+" successfully deposited");
	}
	
	public void withdraw(double amt) throws AmountInsufficientException{
		if(!isValid(amt) || amt > bal) {
			throw new AmountInsufficientException("Invalid withdraw amount");
		}
		bal -= amt;
		System.out.println(amt+" successfully withdrawn");
	}
	
	public static void main(String args[]) {
		try {
			Example2 obj = new Example2(2000);
			obj.deposit(1000);
			System.out.println("Balance:"+obj.bal);
			obj.withdraw(2081);
			System.out.println("Balance:"+obj.bal);
		}catch(AmountException e) {
			System.out.println(e.getMessage());
		}catch(AmountInsufficientException e) {
			System.out.println(e.getMessage());
		}		
	}
}
