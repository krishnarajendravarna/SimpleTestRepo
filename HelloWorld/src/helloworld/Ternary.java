package helloworld;

class Largest{
	int largest_of_three(int a,int b,int c) {
		int res = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
		return res;
	}
}

public class Ternary {
	public static void main(String[] args) {
		int a = 17;
		int b = -89;
		int c = -34;
		Largest obj = new Largest();
		System.out.println("Largest of three is "+obj.largest_of_three(a, b, c));
	}
}
