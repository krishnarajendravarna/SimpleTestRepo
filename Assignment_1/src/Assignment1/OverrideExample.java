package Assignment1;

class Class1{
	public void display() {
		System.out.println("Hi How are you");
	}
	
}

class Class2 extends Class1{
	@Override
	public void display() {
		System.out.println("Who are you");
	}
}

class Class3 extends Class2{
	public void display() {
		System.out.println("Hello World!");
	}
}


public class OverrideExample {
	public static void main(String[] args) {
		Class3 obj = new Class3();
		obj.display();
	}
}
