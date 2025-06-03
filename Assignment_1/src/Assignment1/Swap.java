package Assignment1;
import java.util.Scanner;

public class Swap {
	void swap(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping:"+a+" "+b);
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number:");
		int a = in.nextInt();
		System.out.print("Enter second number:");
		int b = in.nextInt();
		System.out.println("Before swapping:"+a+" "+b);
		Swap ob = new Swap();
		ob.swap(a, b);
	}
}
