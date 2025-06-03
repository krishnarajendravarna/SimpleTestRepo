package Assignment1;
import java.util.Scanner;

class Operation{
	int addition(int a,int b) {
		return a + b;
	}
	int subtraction(int a,int b) {
		return a - b;
	}
	int multiplication(int a,int b) {
		return a * b;
	}
	int division(int a,int b) {
		return a / b;
	}
	int modulus(int a,int b) {
		return a % b;
	}
}

public class Arithmetic {
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		int a;
		int b;
		
		System.out.print("Enter first number:");
		a = o.nextInt();
		System.out.print("Enter second number:");
		b = o.nextInt();
		
		Operation ob = new Operation();
		
		System.out.println("Adition Result:"+ob.addition(a, b));
		System.out.println("Subtraction Result:"+ob.subtraction(a, b));
		System.out.println("Multiplication Result:"+ob.multiplication(a, b));
		System.out.println("Division Result:"+ob.division(a, b));
		System.out.println("Modulus Result:"+ob.modulus(a, b));		
	}
}
