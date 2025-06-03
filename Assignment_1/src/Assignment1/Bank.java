package Assignment1;
import java.util.Scanner;

public class Bank {
	static Scanner in = new Scanner(System.in);
	double bal;
	double amt;
	String name;
	int acno;
	void create_new() {
		System.out.println("1:Savings Account\t2:Current Account");
		System.out.print("Enter your type of account:");
		int c = in.nextInt();
		switch(c) {
			case 1:
				System.out.println("Enter your name:");
				name = in.next();
				System.out.println("Enter account number:");
				acno = in.nextInt();
				System.out.println("Enter the amount for first deposit:");
				amt = in.nextDouble();
				if(amt >= 500) {
					bal += amt;
					System.out.println("Deposit successfully");
				}else {
					System.out.println("Deposit unsuccessful please enter amount more than 500");
				}
				break;	
		}
	}
	void deposit() {
		System.out.print("Enter amount to deposit:");
		amt = in.nextDouble();
		if(amt > 0) {
			bal += amt;
			System.out.print("Deposit sucessfull");
		}else {
			System.out.println("Enter valid amount");
		}
	}
	void withdraw() {
		System.out.print("Enter amount to withdraw:");
		amt = in.nextDouble();
		if((bal - amt) >= 500 && amt > 0) {
			bal -= amt;
			System.out.println("Withdraw successful");
		}else {
			System.out.print("Amount is not sufficient to withdraw");
			System.out.print("Please maintain the minimum balance!");
		}
	}
	void view_balance() {
		System.out.println("Your balance is "+bal);
	}
	
	public static void main(String args[]) {
		int choice;
		Bank obj = new Bank();
		do {
			System.out.println("\t\t-_-_-_-BANK APPLICATION-_-_-_-");
			System.out.println("1.Create Account\n2.Deposit\n3.Withdraw\n4.View Balance");
			choice = in.nextInt();
			switch(choice) {
				case 1:obj.create_new();
				break;
				case 2:obj.deposit();
				break;
				case 3:obj.withdraw();
				break;
				case 4:obj.view_balance();
				break;
				case 5:System.exit(0);
				break;
			}
		}while(choice >= 1 && choice <= 5);	
	}	
}
