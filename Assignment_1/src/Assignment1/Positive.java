package Assignment1;
import java.util.Scanner;

public class Positive {
	boolean at_least_two_positive(int a,int b,int c) {
		return (a > 0 && b > 0) || (a > 0 && c > 0) || (b > 0 && c > 0);
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter three number");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		Positive obj = new Positive();
		
		if(obj.at_least_two_positive(a,b,c)) {
			System.out.println("Atleast two number are positive");
		}else {
			System.out.println("Less than two number are positive");
		}
		
	}
	
}
