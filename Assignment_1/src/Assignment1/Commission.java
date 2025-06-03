package Assignment1;
import java.util.Scanner;

public class Commission {
	double compute(double total_sales) {
		return total_sales * 0.1;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the total sales:");
		double ts = in.nextInt();
		
		Commission ob = new Commission();
		
		System.out.println("Earned commission is:"+ob.compute(ts));
	}
}
