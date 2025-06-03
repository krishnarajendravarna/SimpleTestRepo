package com.string;

import java.util.Scanner;

public class Ex2 {
	public String amountInWords(int amt) {
		if (amt == 0) {
			return "Zero Rupees";
		}

		String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
		String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
		String[] multiplier = { "", "Thousand", "Lakh", "Crore" };
		String result = "";
		int group = 0;
		while (amt > 0) {
			int value;
			if (group == 1) {
				value = amt % 100;
				amt /= 100;
			} else if (group == 2) {
				value = amt % 100;
				amt /= 100;
			} else {
				value = amt % 1000;
				amt /= 1000;
			}

			if (value > 0) {
				String temp = "";
				if (value >= 100) {
					temp += units[value / 100] + " Hundred ";
					value %= 100;
				}
				if (value >= 20) {
					temp += tens[value / 10] + " ";
					value %= 10;
				}
				if (value > 0) {
					temp += units[value] + " ";
				}

				if (!temp.isEmpty()) {
					temp += multiplier[group] + " ";
				}

				result = temp + result;
			}
			group++;
		}
		return result.trim() + " Rupees";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Ex2 ob = new Ex2();
		System.out.println("Enter the amount:");
		int amt = in.nextInt();
		System.out.println("Amount in words: " + ob.amountInWords(amt));
		in.close();
	}
}