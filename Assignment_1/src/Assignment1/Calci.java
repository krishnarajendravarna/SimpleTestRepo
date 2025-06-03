package Assignment1;
import java.util.Scanner;

public class Calci {
	int a;
	int b;
	Calci(int a,int b){
		this.a = a;
		this.b = b;
	}
	int add() {
		return a + b;
	}
	int sub() {
		return a - b;
	}
	int multi() {
		return a * b;
	}
	int division() {
		return a / b;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number:");
		int num1 = in.nextInt();
		System.out.print("Enter second number:");
		int num2 = in.nextInt();
		
		Calci obj = new Calci(num1,num2);
		
		System.out.println("Additin result is "+obj.add());
		System.out.println("Subtraction result is "+obj.sub());
		System.out.println("Multiplication result is "+obj.multi());
		System.out.println("Division result is "+obj.division());
	}
}
