package helloworld;

class Specifier{
	public int x = 10;
	private int a = 20;
	protected int b = 30;
	int c = 40;
	public void display() {
		System.out.println("The access specifier is public:"+x);
	}
	public void display1() {
		System.out.println("The access specifier is private:"+a);
	}
	protected void display2() {
		System.out.println("The access specifier is protected:"+b);
	}
	void display3() {
		System.out.println("The access specifier is default:"+c);
	}
}

public class Accsess {
	private int t = 10;
	private void method() {
		System.out.println("Private access specifier accessed in the same class");
	}
	public static void main(String args[]) {
		Specifier obj = new Specifier();
		Accsess ob = new Accsess();
		obj.x += 10;
		obj.display();
		obj.display2();
		obj.display3();
		obj.display1();
		ob.method();
		System.out.println(obj.x);
		System.out.println(obj.c);
		System.out.println(obj.b);
		System.out.println("The private variable access with in same class:"+ob.t);
	}
}
