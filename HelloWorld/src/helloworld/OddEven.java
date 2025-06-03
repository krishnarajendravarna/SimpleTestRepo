package helloworld;

class Check{
	 String check(int num) {
		if(num % 2 != 0) {
			return num+" is odd";
		}else {
			return num+" is even";
		}
	}		
}

public class OddEven {
	public static void main(String[] args) {
		Check obj1 = new Check();
		String res = obj1.check(100);
		System.out.println(res);
	}
}
