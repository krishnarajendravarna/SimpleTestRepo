package helloworld;

public class Positive {
	int num;
	Positive(){
		num = 10;
	}
	void check() {
		if(num == 0) {
			System.out.println("Number is neither negative nor positive");
		}else if(num < 0) {
			System.out.println("Number is negative");
		}else {
			System.out.println("Number is positive");
		}
	}
	public static void main(String args[]) {
		Positive chk = new Positive();
		chk.check();
	}
}
