package Assignment1;
import java.util.Scanner;

public class Bmi {
	double bmi;
	double bmiCheck(double weight,double height) {
		bmi = weight / (height * height);
		return bmi;
	}
	
	void grade() {
		if(bmi < 18.5) {
			System.out.print("Underweight");
		}else if(bmi >= 18.5 && bmi <= 24.9) {
			System.out.print("Normal");
		}else if(bmi >= 25.0 && bmi <= 29.9) {
			System.out.print("Overweight");
		}else {
			System.out.print("Obesity");
		}
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your weight in kg:");
		double w = in.nextDouble();
		System.out.print("Enter your height in meters:");
		double h = in.nextDouble();
		
		Bmi ob = new Bmi();
		
		System.out.println("Your BMI is "+ob.bmiCheck(w,h));
		System.out.print("Your BMI grade is ");
		ob.grade();
	}

}
