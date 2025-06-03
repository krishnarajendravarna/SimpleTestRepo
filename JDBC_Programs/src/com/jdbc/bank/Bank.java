package com.jdbc.bank;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Random;

class AccountNotFoundException extends Exception {
	public AccountNotFoundException(String message) {
		super(message);
	}
}

class AgeException extends Exception {
	public AgeException(String message) {
		super(message);
	}
}

public class Bank {
	private Scanner in = new Scanner(System.in);
	private Random r = new Random();
	private Connection con;

	public Bank() {
		con = DatabaseConnection.conn();
	}

	boolean eligible(int age) {
		return age > 18;
	}

	BankInfo find(int acno) throws AccountNotFoundException {
		try {
			String query = "SELECT * FROM bank_accounts WHERE acno = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, acno);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				BankInfo account = new Savings();
				account.setAcno(rs.getInt("acno"));
				account.setName(rs.getString("name"));
				account.setSsn(rs.getInt("ssn"));
				account.setAge(rs.getInt("age"));
				account.setLoc(rs.getString("loc"));
				account.setBal(rs.getDouble("balance"));
				account.setLastTransaction(rs.getString("last_transaction"));
				return account;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		throw new AccountNotFoundException("Account number " + acno + " not found.");
	}

	void savingsAccount(String name, int ssn, int age, String loc) {
		int acno = 12 + r.nextInt(10000);
		System.out.println("Enter the initial deposit amount: ");
		double temp = in.nextDouble();

		try {
			String query = "INSERT INTO bank_accounts (acno, name, ssn, age, loc, balance) VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, acno);
			pstmt.setString(2, name);
			pstmt.setInt(3, ssn);
			pstmt.setInt(4, age);
			pstmt.setString(5, loc);
			pstmt.setDouble(6, temp);
			pstmt.executeUpdate();

			System.out.println(name + "'s Savings account successfully created. Account Number: " + acno);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void currentAccount(String name, int ssn, int age, String loc) {
		int acno = 12 + r.nextInt(100000);
		System.out.println("Enter the initial deposit amount: ");
		double temp = in.nextDouble();

		try {
			String query = "INSERT INTO bank_accounts (acno, name, ssn, age, loc, balance) VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, acno);
			pstmt.setString(2, name);
			pstmt.setInt(3, ssn);
			pstmt.setInt(4, age);
			pstmt.setString(5, loc);
			pstmt.setDouble(6, temp);
			pstmt.executeUpdate();

			System.out.println(name + "'s Current account successfully created. Account Number: " + acno);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void createAccount() {
		try {
			System.out.print("Enter a name: ");
			String name = in.next();
			System.out.print("Enter SSN: ");
			int ssn = in.nextInt();
			System.out.print("Enter your age: ");
			int age = in.nextInt();
			System.out.print("Enter your location: ");
			String loc = in.next();
			if (!eligible(age)) {
				throw new AgeException("Your age is less than 18 years. Cannot open an account.");
			}
			System.out.println("Account Type\n1.Savings Account\t2.Current Account");
			int acctype = in.nextInt();
			switch (acctype) {
			case 1:
				savingsAccount(name, ssn, age, loc);
				break;
			case 2:
				currentAccount(name, ssn, age, loc);
				break;
			default:
				System.out.println("Invalid choice");
			}
		} catch (AgeException e) {
			System.out.println("[ERROR] " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("[ERROR] Invalid input !");
			in.next();
		}
	}

	void checkBalance() {
		System.out.print("Enter account number: ");
		int acno = in.nextInt();
		try {
			BankInfo account = find(acno);
			System.out.println("Balance: " + account.getBal());
		} catch (AccountNotFoundException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
	}

	void deposit() {
		try {
			System.out.print("Enter account number: ");
			int acno = in.nextInt();
			BankInfo account = find(acno);

			System.out.print("Enter deposit amount: ");
			double amt = in.nextDouble();
			account.setBal(account.getBal() + amt);
			account.setLastTransaction("Deposited: " + amt);

			String query = "UPDATE bank_accounts SET balance = ?, last_transaction = ? WHERE acno = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setDouble(1, account.getBal());
			pstmt.setString(2, account.getLastTransaction());
			pstmt.setInt(3, acno);
			pstmt.executeUpdate();

			System.out.println("Deposit successful. New balance: " + account.getBal());
		} catch (AccountNotFoundException e) {
			System.out.println("[ERROR] " + e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void withdraw() {
		try {
			System.out.print("Enter account number: ");
			int acno = in.nextInt();
			BankInfo account = find(acno);
			System.out.print("Enter withdrawal amount: ");
			double amt = in.nextDouble();
			if (amt > account.getBal()) {
				System.out.println("[ERROR] Insufficient funds.");
				return;
			}
			account.setBal(account.getBal() - amt);
			account.setLastTransaction("Withdrew: " + amt);

			String query = "UPDATE bank_accounts SET balance = ?, last_transaction = ? WHERE acno = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setDouble(1, account.getBal());
			pstmt.setString(2, account.getLastTransaction());
			pstmt.setInt(3, acno);
			pstmt.executeUpdate();

			System.out.println("Withdrawal successful. New balance: " + account.getBal());
		} catch (AccountNotFoundException e) {
			System.out.println("[ERROR] " + e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void interest() {
		try {
			System.out.print("Enter account number: ");
			int acno = in.nextInt();
			BankInfo account = find(acno);
			System.out.print("Enter the time period: ");
			double time = in.nextDouble();
			double interest = account.interest(time);
			account.setBal(account.getBal() + interest);
			account.setLastTransaction("Interest added: " + interest);

			String query = "UPDATE bank_accounts SET balance = ?, last_transaction = ? WHERE acno = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setDouble(1, account.getBal());
			pstmt.setString(2, account.getLastTransaction());
			pstmt.setInt(3, acno);
			pstmt.executeUpdate();

			System.out.println("Interest added: " + interest);
		} catch (AccountNotFoundException e) {
			System.out.println("[ERROR] " + e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void shortSummary() {
		try {
			System.out.print("Enter account number: ");
			int acno = in.nextInt();
			BankInfo account = find(acno);
			System.out.println("Name: " + account.getName().toLowerCase() + "\nAccount number: " + account.getAcno()
					+ "\nBalance: " + account.getBal());
		} catch (AccountNotFoundException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
	}

	void checkLastTransaction() {
		System.out.print("Enter account number: ");
		int acno = in.nextInt();
		try {
			BankInfo account = find(acno);
			System.out.println("Name: " + account.getName().toLowerCase() + "\nAccount number: " + account.getAcno()
					+ "\nBalance: " + account.getBal());
			System.out.println("Last Transaction: " + account.getLastTransaction());
		} catch (AccountNotFoundException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in);
		Bank obj = new Bank();
		int choice;
		System.out.println("*******Bank Application*******");
		try {
			while (true) {
				System.out.println(
						"1.Create Account\n2.Check Balance\n3.Deposit\n4.Withdraw\n5.Simple Interest\n6.Short Summary\n7.Last Transaction\n8.Exit");
				choice = in1.nextInt();
				switch (choice) {
				case 1:
					obj.createAccount();
					break;
				case 2:
					obj.checkBalance();
					break;
				case 3:
					obj.deposit();
					break;
				case 4:
					obj.withdraw();
					break;
				case 5:
					obj.interest();
					break;
				case 6:
					obj.shortSummary();
					break;
				case 7:
					obj.checkLastTransaction();
					break;
				case 8:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter valid input");
			in1.next();
		} finally {
			try {
				if (obj.con != null && !obj.con.isClosed()) {
					obj.con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
