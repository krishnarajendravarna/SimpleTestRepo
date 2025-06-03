package Assignment1;
import java.util.Scanner;

class Assign{
	int increment(int a) {
		return a+=5;
	}
	int decrement(int b) {
		return b-=3;
	}
}

public class Increment {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first variable:");
		int m = in.nextInt();
		System.out.print("Enter second variable:");
		int n = in.nextInt();
		
		Assign ob = new Assign();
		
		System.out.println("Variable is incremented by 5:"+ob.increment(m));
		System.out.println("Variable is decremented by 3:"+ob.decrement(n));
	}
}
