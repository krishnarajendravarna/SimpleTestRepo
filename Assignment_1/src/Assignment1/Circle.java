package Assignment1;
import java.util.Scanner;

class Find{
	final double pi = 3.14;
	double area(double r) {
		return pi * Math.pow(r,2);
	}
	double circumference(double r) {
		return 2 * pi * r;
	}
}

public class Circle {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a radius of circle:");
		double r = in.nextDouble();
		
		Find ob = new Find();
		
		System.out.println("The area of circle is "+ob.area(r));
		System.out.println("The circumference of circle is "+ob.circumference(r));		
	}
}
