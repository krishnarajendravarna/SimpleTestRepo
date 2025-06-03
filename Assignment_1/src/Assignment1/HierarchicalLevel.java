package Assignment1;

class Fields{
	private int a = 90;
	private int b = 45;
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	public void setA(int a) {
		this.a = a;
	}
}

class AddSub extends Fields{
	void add() {
		int res = getA() + getB();
		System.out.println("Addition Result:"+res);
	}
	void sub() {
		int res = getA() - getB();
		System.out.println("Subtraction Result:"+res);
	}
}

class MultiDiv extends Fields{
	void multi() {
		int res = getA() * getB();
		System.out.println("Multiplication Result:"+res);
	}
	void division() {
		int res = getA() / getB();
		System.out.println("Division Result:"+res);
	}
}

public class HierarchicalLevel {
	public static void main(String[] args) {
		AddSub ob = new AddSub();
		ob.add();
		ob.sub();
		MultiDiv ob1 = new MultiDiv();
		ob1.multi();
		ob1.division();
	}
}
