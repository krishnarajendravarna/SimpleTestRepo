package helloworld;

public class Pattern {
	public static void main(String args[]) {
		/*for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*for(int i = 1; i <= 5; i++) {
			for(int j =(5 - i); j >= 1 ; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*for(int i = 1 ; i <= 5; i++) {
			for(int j = 1; j <= 5;j++) {
				if(i == 1 || i == 5 || j == 1 || j == 5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		/*for(int i = 7; i <= 1; i--) {
			for(int j = i; j < 7; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i - 1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		int binary = 1010;
		int decimal = 0;
		int i1 = 0;
		while(binary > 0) {
			decimal += Math.pow(2,i1++) * (binary % 10);
			binary /= 10;
		}
		System.out.println("Decimal number:"+decimal);
		
		for(int i=1;i<=10;i++) {
			System.out.println("17*"+i+"="+i*17);
		}
	}
}
