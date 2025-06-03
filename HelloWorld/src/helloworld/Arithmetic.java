package helloworld;

class Arithmetic_Operators{
	int res;
	int add(int a,int b) {
		res = a + b;
		return res;
	}
	int sub(int a,int b) {
		res = a - b;
		return res;
	}
	int multi(int a,int b) {
		res = a * b;
		return res;
	}
	int division(int a,int b) {
		if(b > 0) {
			res = a / b;
		}
		else {
			System.out.println("Division by zero error");
		}
		return res;
	}
	int modulo(int a,int b) {
		if(b > 0) {
			res = a % b;
		}
		else {
			System.out.println("Division by zero error");
		}
		return res;
	}
}

public class Arithmetic {

	public static void main(String[] args) {
		int a = 25;
		int b = 10;
		Arithmetic_Operators obj = new Arithmetic_Operators();
		System.out.println("+ operator:"+obj.add(a, b));
		System.out.println("- operator:"+obj.sub(a, b));
		System.out.println("* operator:"+obj.multi(a, b));
		System.out.println("/ operator:"+obj.division(a, b));
		System.out.println("% operator:"+obj.modulo(a, b));
	}

}
