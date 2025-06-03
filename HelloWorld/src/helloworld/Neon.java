package helloworld;

class ClassA{
	int number;
	ClassA(){
		number = 2;
	}
	void neon() {
		int temp = number;
		int result = number * number;
		int sum = 0;
		while(result > 0) {
			int digit = result % 10;
			sum = sum + digit;
			result = result / 10;
		}
		if(temp == sum) {
			System.out.println("The number is a neon number");
		}else {
			System.out.println("The number is not a neon number");
		}
	}
}
public class Neon {
	public static void main(String[] args) {
		ClassA call = new ClassA();
		call.neon();
	}
}
