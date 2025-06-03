package helloworld;

class Solution{
	double a,b,c;
	Solution(double a,double b,double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	void calculate() {
		double result = b * b - (4 * a * c);
		if(result > 0) {
			double r1 = (-b + Math.pow(result,0.5)) / 2.0 * a;
			double r2 = (-b - Math.pow(result,0.5)) / 2.0 * a;
			System.out.println("The roots are:"+r1+" and "+r2);
		}else if(result == 0) {
			double r1 = -b / (2 * a);
			System.out.println("The roots is"+r1);
		}else {
			System.out.println("There is no roots");
		}
	}
}

public class Quadratic {
	public static void main(String args[]) {
		Solution obj = new Solution(1,5,2);
		obj.calculate();
	}
}
