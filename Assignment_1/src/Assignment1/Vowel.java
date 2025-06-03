package Assignment1;
import java.util.Scanner;

public class Vowel {
	boolean isVowel(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		else
			return false;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a character to check vowel or not:");
		char chr = in.next().charAt(0);
		
		Vowel obj = new Vowel();
		
		if(obj.isVowel(chr)) {
			System.out.println(chr+" is a vowel letter.");
		}else {
			System.out.println(chr+" is a consonent.");
		}
		
	}
}
