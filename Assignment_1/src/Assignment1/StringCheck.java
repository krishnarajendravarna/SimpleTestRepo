package Assignment1;
import java.util.Scanner;

public class StringCheck {
	boolean checking(String str) {
		boolean isUpper = false;
		boolean isLower = false;
		for(int i = 0;i < str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				isLower = true;
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				isUpper = true;		
		}
		return isUpper && isLower;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str = in.next();
		
		StringCheck obj = new StringCheck();
		
		if(obj.checking(str)) {
			System.out.println("The given string contain both uppercase and lowercase");
		}else {
			System.out.println("The given string does not contain both uppercase and lowercase");
		}
	}
}
