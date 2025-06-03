package helloworld;

class UnaryOperators{
	public int pre_incre(int operand) {
		int result = (++operand * 5) + operand;
		return result;
	}
	public int post_incre(int opd) {
		int res = (opd++ * 5) + opd;
		return res;
	}
	public int pre_decre(int opd) {
		int res = (--opd * 5) + opd;
		return res;
	}
	public int post_decre(int opd) {
		int result = (opd-- * 5) +opd;
		return result;
	}
}

public class Unary {

	public static void main(String[] args) {
		UnaryOperators obj = new UnaryOperators();
		System.out.println("Pre-Increment result="+obj.pre_incre(10));
		System.out.println("Post-Increment result="+obj.post_incre(10));
		System.out.println("Pre-Decrement result="+obj.pre_decre(10));
		System.out.println("Post-Decrement result="+obj.post_decre(10));
	}

}
