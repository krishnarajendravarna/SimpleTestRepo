package Assignment1;

class One{
	public int add(int a,int b) {
		return a + b;
	}
}

class Two extends One{
	public int sub(int x,int y) {
		return x - y;
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Two obj = new Two();
		System.out.println("Addition:"+obj.add(10, 20));
		System.out.println("Subtraction:"+obj.sub(45, 23));
	}

}
