package Assignment1;
import java.util.Scanner;

public class EvenOdd {
	boolean check(int num) {
		return (num % 2 == 0);
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = in.nextInt();
		
		EvenOdd obj = new EvenOdd();
		
		if(obj.check(number)) {
			System.out.println(number+" is Even number.");
		}else {
			System.out.println(number+" is Odd number.");
		}
	}

}
