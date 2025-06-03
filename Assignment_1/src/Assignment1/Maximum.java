package Assignment1;
import java.util.Scanner;

public class Maximum {
	int max_of_two(int m,int n) {
		int res = (m >= n) ? m : n;
		return res;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number:");
		int a = in.nextInt();
		System.out.print("Enter second number:");
		int b = in.nextInt();
		
		Maximum obj = new Maximum();
		
		System.out.println("The largest among two numbers is "+obj.max_of_two(a,b));
	}

}
