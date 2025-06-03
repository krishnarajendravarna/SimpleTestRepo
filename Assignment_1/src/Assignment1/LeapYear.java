package Assignment1;
import java.util.Scanner;

public class LeapYear {
	boolean isLeapYear(int year) {
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				}else {
					return false;
				}
			}else {
				return true;
			}
		}else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the year:");
		int year = in.nextInt();
		LeapYear obj = new LeapYear();
		if(obj.isLeapYear(year)) {
			System.out.println(year+" is a Leap year");
		}else {
			System.out.println(year+" is not a Leap year");
		}
	}
	
}
