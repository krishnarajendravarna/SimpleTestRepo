package Assignment1;
import java.util.Scanner;

public class Check_pos_neg {
	String check(int num) {
		String res = (num > 0) ? "Positive Number" : "Negative Number";
		return res;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = in.nextInt();
		
		Check_pos_neg obj = new Check_pos_neg();
		
		System.out.println("The given number is "+obj.check(n));
	}
}
