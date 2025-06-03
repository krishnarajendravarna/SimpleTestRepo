package com.string;

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "Krishna";
		String s2 = new String("Rajendra");
		String s3 = "Krishna";
		int age = 22;
		char a = 'c';
		//String c = "Abhi";

		// Length of a string
		System.out.println("Length of s1 string:" + s1.length());
		System.out.println("Length of s2 string:" + s2.length());

		// charAt method to extract individual character
		System.out.println("Second character in s1:" + s1.charAt(1));
		System.out.println("Fourth character in s2:" + s1.charAt(3));

		// getChars method to extract more than one character
		char[] extract = new char[4 - 0];
		s1.getChars(0, 2, extract, 2);
		System.out.println("Extracted character are:" + String.valueOf(extract));
		System.out.println(extract);

		// equals() method
		System.out.println("s1==s2:" + s1.equals(s2));
		System.out.println("s1==s3:" + s1.equalsIgnoreCase(s3));

		// region matches
		System.out.println("Region match:" + s1.regionMatches(1, s3, 1, 4));
		System.out.println("Region match with ignorecase:" + s1.regionMatches(true, 0, s3, 0, 4));

		// startswith and endswith
		System.out.println("S1 start with Kri:" + s1.startsWith("Kri"));
		System.out.println("S2 end with dra:" + s2.endsWith("dra"));

		// compareTo
		int res = s1.compareTo(s3);
		if (res > 0) {
			System.out.println("Krishna > krishna\nValue=" + res);
		} else if (res < 0) {
			System.out.println("Krishna < krishna\nValue=" + res);
		} else {
			System.out.println("Krishna = krishna\nValue=" + res);
		}

		// searching
		System.out.println("First occurance of a in Rajendra:" + s2.indexOf('a'));
		System.out.println("Last occurance of a in Rajendra:" + s2.lastIndexOf('a'));

		// substring
		System.out.println("Extarcting the substring from Rajendra:" + s2.substring(2));

		// concatenation
		System.out.println("Concating Krishna and Rajendra string:" + s1.concat(s2));

		// replacing
		System.out.println("In Krishna i is replace with u:" + s1.replace('i', 'u'));

		// trim
		String x = " Java ";
		System.out.println("Using trim remove the extra space in \" Java \":" + x.trim());

		// case changing
		System.out.println("Uppercase:" + s1.toUpperCase());
		System.out.println("Lowecase:" + "LOWERCASE".toLowerCase());

		// join
		String result = String.join(" ", "Java", "is", "simple");
		System.out.println(result);

		// format
		String s = String.format("Firstname: %s Lastname: %s  Age:%d", s1, s2, age);
		System.out.println(s);

		char[] c = new char[s1.length()];
		c = s1.toCharArray();
		for (char i : c) {
			System.out.print("'" + i + "'\t");
		}
		System.out.println();
		byte[] b = new byte[s1.length()];
		b = s1.getBytes();
		for (byte i : b) {
			System.out.print("'" + i + "'\t");
		}
	}
}
