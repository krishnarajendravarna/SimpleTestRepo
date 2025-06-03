package com.collection;

import java.util.LinkedList;
import java.util.Scanner;

class Bank1{
	String name;
	int ssn;
	int age;
	String loc;
	int acno;
	double bal;
	
	Bank1(String name,int ssn,int age,String loc,int acno,double bal){
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		this.loc = loc;
		this.acno = acno;
		this.bal = bal;
	}
}

public class CollectionExample1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<Bank1> acc = new LinkedList<Bank1>();
		acc.add(new Bank1("Krishna",25647,22,"Udupi",25371,1000.0));
		acc.add(new Bank1("Raj",27647,25,"Mysore",29678,2000.0));
		acc.add(new Bank1("Abhi",25347,22,"Blore",2567,3000.0));
		
		Integer acno;
		System.out.println("Enter account number:");
		acno = in.nextInt();
		if(acc.contains(acno)) {
			
		}
	}

}
