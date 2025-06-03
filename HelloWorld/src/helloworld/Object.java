package helloworld;

class Pass{
	int a;
	int b;
	Pass(Pass ob){
		a = ob.a;
		b = ob.b;
	}
	Pass(int a,int b){
		this.a = a;
		this.b = b;
	}
	int add(Pass ob) {
		return ob.a + ob.b;
	}
	String display(Pass obj) {
		return obj.a+" "+obj.b;
	}
}

public class Object {
	public static void main(String args[]) {
		Pass obj1 = new Pass(10,20);
		Pass obj2 = new Pass(obj1);
		Pass obj3 = new Pass(obj1);
		System.out.println("Arguments are passed as object");
		System.out.println("The result is:"+obj2.add(obj1));
		System.out.println("Values are :" + obj2.display(obj3));
	}
}
