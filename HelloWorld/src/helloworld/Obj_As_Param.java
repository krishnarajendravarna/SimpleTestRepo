package helloworld;

class cal{
	int a;
	int b;
	cal(int a,int b){
		this.a = a;
		this.b = b;
	}
	int add(cal ob) {
		return ob.a + ob.b;
	}
	int sub(cal ob) {
		return ob.a - ob.b;
	}
}

public class Obj_As_Param {
	public static void main(String args[]) {
		int x = 90;
		int y = 23;
		cal obj1 = new cal(x,y);
		System.out.println("Addition result:"+obj1.add(obj1));
		System.out.println("Subtraction result:"+obj1.sub(obj1));
		
	}
}
