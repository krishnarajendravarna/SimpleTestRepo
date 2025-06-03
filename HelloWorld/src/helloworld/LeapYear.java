package helloworld;

class Method{
	int year;
	Method(){
		year = 2014;
	}
	void check() {
		if(year % 4 == 0) {
			System.out.println("Year is leap year");
		}else {
			System.out.println("Year is not leap year");
		}
	}
}

public class LeapYear {
	public static void main(String[] args) {
		Method met = new Method();
		met.check();
	}
}
