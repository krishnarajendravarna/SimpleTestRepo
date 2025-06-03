package Assignment1;
import java.util.Scanner;

public class Sum_of_digits {
	int sum(int n) {
		int total = 0;
		while(n > 0) {
			int dig = n % 10;
			total+=dig;
			n /= 10;
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = in.nextInt();
		
		Sum_of_digits ob = new Sum_of_digits();
		
		System.out.println("Sum of digits are:"+ob.sum(n));
	}
}
