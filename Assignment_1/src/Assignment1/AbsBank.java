package Assignment1;

abstract class BAcc{
	private int acno;
	private double bal;
	
	public BAcc(int acno,double bal) {
		this.acno = acno;
		this.bal = bal;
	}
	
	public double getBal() {
		return bal;
	}
	
	public int getAcno() {
		return acno;
	}
	
	public void setBal(double bal) {
		this.bal = bal;
	}
	
	abstract void deposit(double amt);
	
	abstract void withdraw(double amt);
	
}

class Save extends BAcc{
	public Save(int acno,double balance) {
		super(acno,balance);
	}
	
	@Override
	public void deposit(double amt) {
		setBal(getBal() + amt);
		System.out.println("Sucessfully deposited");
	}
	
	@Override
	public void withdraw(double amt) {
		if(getBal() >= amt) {
			setBal(getBal()-amt);
			System.out.println("Sucessfully withdrawal!");
		}else {
			System.out.println("Insufficient balance");
		}
	}
}

class Curr extends BAcc{
	public Curr(int acno,double balance) {
		super(acno,balance);
	}
	
	@Override
	public void deposit(double amt) {
		setBal(getBal() + amt);
		System.out.println("Sucessfully deposited");
	}
	
	@Override
	public void withdraw(double amt) {
		if((getBal() - amt) > 100) {
			setBal(getBal()-amt);
			System.out.println("Sucessfully withdrawal!");
		}else {
			System.out.println("Insufficient balance");
		}
	}
}


public class AbsBank {
	public static void main(String[] args) {
		Save s = new Save(123,1200);
		s.deposit(800);
		s.withdraw(200);
		
		Curr c = new Curr(1089,1000);
		c.deposit(1000);
		c.withdraw(1800);
	}
}
