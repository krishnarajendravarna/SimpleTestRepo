package helloworld;

class Change{
	int num1 = 10;
	int num2 = 20;
	void swap() {
		System.out.println("Before swapping"+" "+num1+" "+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swapping"+" "+num1+" "+num2);
	}
}

public class Swap {
	public static void main(String[] args) {
		Change obj2 = new Change();
		obj2.swap();
	}
}
