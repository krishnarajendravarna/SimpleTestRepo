package Assignment1;

import java.util.Scanner;

class Sample{
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public void display() {
		System.out.println("A:"+getA()+"\nB:"+getB());
	}
	
}
public class GetterAndSetter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Sample obj = new Sample();
		int a = in.nextInt();
		int b = in.nextInt();
		obj.setA(a);
		obj.setB(b);
		System.out.println("Value1:"+obj.getA()+"\nValue2:"+obj.getB());
	}
}
