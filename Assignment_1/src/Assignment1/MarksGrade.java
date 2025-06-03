package Assignment1;
import java.util.Scanner;

public class MarksGrade {
	double res;
	double finalGrade(double assign,double mid,double fi) {
		res = (assign * 0.3) + (mid * 0.3) + (fi * 0.4);
		return res;
	}
	
	void grade() {
		if(res >= 90 && res <= 100) {
			System.out.println("Your Grade is A");
		}else if(res >= 80) {
			System.out.println("Your Grade is B");
		}else if(res >= 70) {
			System.out.println("Your Grade is C");
		}else if(res >= 60) {
			System.out.println("Your Grade is D");
		}else {
			System.out.println("Your Grade is F");
		}
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter assignment marks:");
		double assignment = in.nextDouble();
		System.out.print("Enter midterm marks:");
		double midterm = in.nextDouble();
		System.out.print("Enter final marks:");
		double marks = in.nextDouble();
		
		MarksGrade ob = new MarksGrade();
		
		if(assignment >=0 && midterm >=0 && marks >= 0) {
			System.out.println("Your final grade marks:"+ob.finalGrade(assignment,midterm,marks));
			ob.grade();
		}else {
			System.out.println("Please enter valid marks");
		}				
	}
}
