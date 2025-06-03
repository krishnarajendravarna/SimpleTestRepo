package helloworld;

class Abcd{
	public static int x = 10;
	public static String name = "Java";
	int b = 50;
}

public class Variable {
	static int y = 20;
	public static void main(String[] args) {
		Abcd obj = new Abcd();
		System.out.println("Variable x:"+Abcd.x);
		System.out.println("Variable y:"+y);
		System.out.println("Variable name:"+Abcd.name);
		System.out.println("Variable b:"+obj.b);
	}

}
