package Assignment1;
import java.util.Scanner;

public class Relational {
	void check(int m,int n) {
		System.out.println(m+" == "+n+":"+(m == n));
		System.out.println(m+" != "+n+":"+(m != n));
		System.out.println(m+" > "+n+":"+(m > n));
		System.out.println(m+" >= "+n+":"+(m >= n));
		System.out.println(m+" < "+n+":"+(m < n));
		System.out.println(m+" <= "+n+":"+(m <= n));
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number:");
		int x = in.nextInt();
		System.out.print("Enter second number:");
		int y = in.nextInt();
		
		Relational re = new Relational();
		
		re.check(x,y);
	}
}
