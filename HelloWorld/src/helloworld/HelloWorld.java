package helloworld;

class Operations{
	float num1 = 25;
	float num2 = 5;
	float result;
	void add() {
		result = num1 + num2;
		System.out.println("Addition result:"+result);
	}
	void sub() {
		result = num1 - num2;
		System.out.println("Subtraction result:"+result);
	}
	void multi() {
		result = num1 * num2;
		System.out.println("Multiplication result:"+result);
	}
	void division() {
		result = num1 / num2;
		System.out.println("Division result:"+result);
	}
}

public class HelloWorld {

	public static void main(String[] args) {
		Operations obj = new Operations();
		obj.add();
		obj.sub();
		obj.multi();
		obj.division();
	}

}
