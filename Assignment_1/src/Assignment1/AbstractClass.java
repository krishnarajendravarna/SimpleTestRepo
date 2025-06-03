package Assignment1;

abstract class Shape{
	abstract double calculateArea();
	abstract double calculatePerimeter();
	public void display() {
		System.out.println("This is from shape class");
	}
}

class Circl extends Shape{
	private double radius;
	
	public Circl(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return 3.14 * radius * radius;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * 3.14 * radius;
	}
}

class Rectangle extends Shape{
	private double length;
	private double breadth;
	
	public Rectangle(double length,double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double calculateArea() {
		return length * breadth;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * (length + breadth);
	}
}


public class AbstractClass {
	public static void main(String[] args) {
		Circl c = new Circl(5.7);
		System.out.println("Area of circle="+c.calculateArea());
		System.out.println("Perimeter of circle="+c.calculatePerimeter());
		c.display();
		Rectangle r = new Rectangle(8.9,6.9);
		System.out.println("Area of rectangle="+r.calculateArea());
		System.out.println("Perimeter of rectangle="+r.calculatePerimeter());
		r.display();
	}
}
