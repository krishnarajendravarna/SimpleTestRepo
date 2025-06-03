package helloworld;

class Find{
	int num1 = 234;
	int num2 = 435;
	void check() {
		if(num1 > num2) {
			System.out.println(num1+" "+"is grater than "+num2);
		}else {
			System.out.println(num1+" "+"is less than "+num2);
		}
	}
}
public class Main {
	public static void main(String[] args) {
		Find obj = new Find();
		obj.check();
	}
}
