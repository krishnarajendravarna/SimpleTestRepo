package helloworld;

public class Week {
	int day;
	Week(){
		day = 3;
	}
	String weekday = "";
	void dayname() {
		switch(day) {
			case 1:weekday = "Monday";
			System.out.println("Week first day is "+weekday);
			break;
			case 2:weekday = "Tuesday";
			System.out.println("Week second day is "+weekday);
			break;
			case 3:weekday = "Wednesday";
			System.out.println("Week thrid day is "+weekday);
			break;
			case 4:weekday = "Thursday";
			System.out.println("Week fourth day is "+weekday);
			break;
			case 5:weekday = "Friday";
			System.out.println("Week fifth day is "+weekday);
			break;
			case 6:weekday = "Saturday";
			System.out.println("Week sixth day is "+weekday);
			break;
			case 7:weekday = "Sunday";
			System.out.println("Week seventh day is "+weekday);
			break;
			default:
				System.out.println("Please enter a correct day number");
		}
	}
	public static void main(String args[]) {
		Week obj = new Week();
		obj.dayname();
	}
}
