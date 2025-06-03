package Assignment1;

interface Account {
	void deposit(double amt);

	void withdraw(double amt);

	double getBalance();
}

class Savings implements Account {
	private double bal;
	private int acno;

	public Savings(double bal, int acno) {
		this.bal = bal;
		this.acno = acno;
	}

	@Override
	public double getBalance() {
		return bal;
	}

	@Override
	public void deposit(double amt) {
		if (amt > 0) {
			bal += amt;
			System.out.println(amt + " Sucessfully deposited\nBalance=" + getBalance());
		} else {
			System.out.println("Amount must be greater than zero");
		}
	}

	@Override
	public void withdraw(double amt) {
		if (bal >= amt) {
			bal -= amt;
			System.out.println(amt + " Sucessfully withdrawal!\nBalance" + getBalance());
		} else {
			System.out.println("Insufficient balance");
		}
	}
}

public class BankInterface {
	public static void main(String[] args) {
		Savings s = new Savings(1000, 23);
		s.deposit(500);
		s.withdraw(250);

		Account s1 = new Savings(2000, 256);
		s1.deposit(2500);
		s1.withdraw(500);
	}
}
