package helloworld;

class BitWise_Op{
	int res;
	int bit_or(int a,int b) {
		res = a | b;
		return res;
	}
	int bit_and(int a,int b) {
		res = a & b;
		return res;
	}
	int bit_xor(int a,int b) {
		res = a ^ b;
		return res;
	}
	int bit_com(int a) {
		res = ~a;
		return res;
	}
	int right_shift(int a,int n) {
		res = a >> n;
		return res;
	}
	int left_shift(int a,int n) {
		res = a << n;
		return res;
	}
	int in_right_shift(int a,int n) {
		res = a >>> n;
		return res;
	}
}

public class BitWise {

	public static void main(String[] args) {
		BitWise_Op obj = new BitWise_Op();
		BitWise_Op obj2 = new BitWise_Op();
		System.out.println("Bitwise-OR:"+obj.bit_or(2, 5));
		System.out.println("Bitwise-AND:"+obj.bit_and(2, 5));
		System.out.println("Bitwise-XOR:"+obj.bit_xor(2, 5));
		System.out.println("Bitwise-Complement:"+obj.bit_com(2));
		System.out.println("Bitewise-Right Shift:"+obj.right_shift(5,2));
		System.out.println("Bitwise-Left Shift:"+obj.left_shift(5,2));
		System.out.println("Bitwise-Unsigned:"+obj.in_right_shift(5,2));
		System.out.println("Bitwise-OR:"+obj2.bit_or(4, 5));
		System.out.println("Obj2 is the instance of class Bitwise_Op:"+(obj2 instanceof BitWise_Op));
	}

}
