package helloworld;

class Compound{
	public double calculate(double p,double t,double r) {
		double ci = p * (Math.pow((1 + r /100),t));
		return ci;
	}
	public double si(double p,double t,double r){
		double si = (p*t*r)/100;
		return si;	
	}
}

public class Armstrong {
	public static void main(String[] args) {
		double p = 100000;
		double t = 5;
		double r = 4;
		Compound obj = new Compound();
		double ci = obj.calculate(p,t,r);
		System.out.println("Compound Interest="+ci);
		double si = obj.si(p, t, r);
		System.out.println("Simple Interest="+si);
	}

}
