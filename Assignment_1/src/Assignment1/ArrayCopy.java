package Assignment1;
import java.util.Arrays;

public class ArrayCopy {
	public static void main(String args[]) {
		int[] a = {3,7,9,5};
		int[] b = new int[a.length];	
		for(int i = 0;i < a.length;i++) {
			b[i] = a[i];
		}		
		for(int i:a) {
			System.out.println(i);
		}		
		System.out.println("Using manual copy");		
		for(int i:b) {
			System.out.println(i);
		}
		
		int[] c = {2,11,13,29};
		int[] d = c.clone();		
		System.out.println("Using clone method");
		for(int i:d) {
			System.out.println(i);
		}
		
		int[] e = {23,90,56};
		int[] f = new int[e.length];
		System.arraycopy(e,0,f,0,3);	
		System.out.println("Using System.arraycopy() method");
		for(int i:f) {
			System.out.println(i);
		}
		
		String[] g = {"Hi","Hello","Good"};
		String[] h = Arrays.copyOf(g,3);
		System.out.println("Using Arrays.copyOf() method");
		for(String i:h) {
			System.out.println(i);
		}
		
		char[] x = {'A','E','I','O','U'};
		char[] y = Arrays.copyOfRange(x, 0,3 );
		System.out.println("Using Arrays.copyOfRange() method");
		for(char i:y) {
			System.out.println(i);
		}
	}
}
