package helloworld;

class Test{
	int a,b;
	Test(int i,int j){
		a = i;
		b = j;
	}
	boolean equalTo(Test o) {
		if(o.a == a && o.b == b)
			return true;
		else 
			return false;
	}
}

public class Passing {
	public static void main(String[] args) {
		Test ob1 = new Test(10,20);
		Test ob2 = new Test(10,20);
		Test ob3 = new Test(20,10);
		
		System.out.println("ob1 == ob2:"+ob1.equalTo(ob2));
		System.out.println("ob1 == ob3:"+ob1.equalTo(ob3));
	}
}
