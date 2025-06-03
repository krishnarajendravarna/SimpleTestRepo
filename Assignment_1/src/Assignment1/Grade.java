package Assignment1;
import java.util.Scanner;

public class Grade {
	String grades(int marks) {
		return (marks >= 90 && marks <= 100) ? "A" :
			   (marks >= 80 && marks <= 89) ? "B" :
			   (marks >= 70 && marks <= 79) ? "C" :
			   (marks >= 60 && marks <= 69) ? "D" : "F";			
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your marks:");
		int score = in.nextInt();
		
		Grade obj = new Grade();
		
		System.out.println("Your grade is "+obj.grades(score));
	}
}
