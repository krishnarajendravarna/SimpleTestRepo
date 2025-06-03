package com.string;

public class StringBufferMethods {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("StringBuffer is mutable and");
		StringBuffer sb1 = new StringBuffer("abcd");
		StringBuffer sb2 = new StringBuffer("abcd");
		
		System.out.println("sb1 equals to sb2:"+sb1.equals(sb2));
		System.out.println(sb1==sb2);

		// length()
		/*System.out.println("Length of sb:" + sb.length());

		// capacity()
		System.out.println("Capacity of sb:" + sb.capacity());

		// ensureCapacity()
		sb.ensureCapacity(35);
		System.out.println("After ensure capacity:" + sb.capacity());

		// setLength()
		sb.setLength(23);
		System.out.println("After setLength() method length of sb:" + sb.length());
		System.out.println("After setlength:" + sb.capacity());

		// charAt()
		System.out.println("Character at 7th position:" + sb.charAt(6));

		// setCharAt()
		sb.setCharAt(7, 'y');
		System.out.println("After set the character:" + sb);

		// getChars()
		char[] ch = new char[5 - 1];
		sb.getChars(1, 5, ch, 0);
		System.out.println("Get the character");
		System.out.println(ch);

		// append()
		System.out.println("append to the sb:" + sb.append("and Synchronize"));
		System.out.println("Capacity:" + sb.capacity());
		System.out.println("Length:" + sb.length());

		// insert()
		System.out.println("Insert to the sb:" + sb.insert(12, " table"));
		System.out.println("Capacity:" + sb.capacity());
		System.out.println("Length:" + sb.length());

		// reverse()
		System.out.println("Reveres the sb:" + sb.reverse());

		// delete()
		System.out.println("Delete in the sb:" + sb.delete(5, 9));

		// replace
		System.out.println("Replace the sb:" + sb.replace(0, 4, "HiHi"));

		// substring
		System.out.println("Substring from sb:" + sb.substring(5, 10));*/

	}

}
