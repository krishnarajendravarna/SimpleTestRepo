package Assignment1;
import java.util.Scanner;

public class Temperature {
	double toFahrenheit(double t) {
		return (t * 9/5) + 32;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter temperature in celcius format:");
		double c = in.nextInt();
		
		Temperature ob = new Temperature();
		
		System.out.println("The given temperature in fahrenheit is "+ob.toFahrenheit(c));
	}
}
