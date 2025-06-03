package Assignment1;

class Variable{
	int a = 20;
	int b = 40;
}

class Op extends Variable{
	int res = a + b;
}

class Display extends Op{
	void display() {
		System.out.println("Result:"+res);
	}
}

public class MultiLevel {
	public static void main(String[] args) {
		Display obj = new Display();
		obj.display();
	}
}
