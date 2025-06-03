package com.jdbc.bank;

import java.util.Scanner;

public class Current extends BankInfo {
	private Scanner in = new Scanner(System.in);
	private final double rate = 0.15;

	@Override
	public double interest(double time) {
		return (getBal() * rate * time) / 100;
	}

	@Override
	public void initialDeposit(double temp) {
		while (temp < 500 || !(temp % 100 == 0)) {
			System.out.println("Enter a valid amount (must be a positive number and multiple of 100):");
			temp = in.nextDouble();
		}
		setBal(getBal() + temp);
		System.out.println("Sucessfully deposited:" + temp);
	}
}
