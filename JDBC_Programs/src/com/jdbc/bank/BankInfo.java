package com.jdbc.bank;

class InvalidTransactionException extends Exception{
	public InvalidTransactionException(String message) {
		super(message);
	}
}

abstract class BankInfo {
	private int age;
	private String name;
	private int ssn;
	private String loc;
	private int acno;
	private double bal;
	private String lastTransaction;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	
	public void setLastTransaction(String lastTransaction) {
		this.lastTransaction = lastTransaction;
	}
	
	public String getLastTransaction() {
		return lastTransaction;
	}

	abstract void initialDeposit(double temp);

	public void deposit(double amt) throws InvalidTransactionException{
		if (amt <= 0 || amt % 100 != 0) {
			throw new InvalidTransactionException("Deposit Amount should be positive and multiplies of 100");
		} 
		setBal(getBal() + amt);
		lastTransaction = "Deposited: " + amt;
		System.out.println("Sucessfully deposited:" + amt);
	}

	public void withdraw(double amt) throws InvalidTransactionException {
		if (amt <= 0 || amt > getBal()) {
			throw new InvalidTransactionException("Invalid withdraw amount");			
		} 
		setBal(getBal() - amt);
		lastTransaction = "Withdrawn: " + amt;
		System.out.println("Sucessfully withdrwan:" + amt);
	}

	abstract double interest(double time);

	public void checkBalance() {
		System.out.println("Current Balance: " + getBal());
	}
}
