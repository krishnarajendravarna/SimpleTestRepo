package Assignment1;
import java.util.Scanner;

public class Range {
	boolean betweenRange(int start,int end,int num) {
		return num >= start && num <= end;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the start range:");
		int start = in.nextInt();
		System.out.print("Enter the end range:");
		int end = in.nextInt();
		System.out.print("Enter the number to check:");
		int num = in.nextInt();
		
		Range ob = new Range();
		
		if(ob.betweenRange(start, end, num)) {
			System.out.println("The given number is in the range");
		}else {
			System.out.println("The given number is not in the range");
		}
	}
}
