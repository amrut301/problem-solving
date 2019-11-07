package com.coding.question;

import java.util.Arrays;

public class Panagram {
	public static void main(String[] args) {
		String b = "The quick brown fox js over a lazy dog";
		String a = b.replace(" ", "");
		a = a.toUpperCase();
		char c[] = a.toCharArray();

		if (c.length < 26) {
			System.out.println( "\""+b+"\""+  " not a Pangram, as the lenght is: "+a.length());
			System.exit(0);;
		}

		int[] ref = new int[26];
		Arrays.fill(ref, 0);
		for (int i = 0; i < c.length; i++) {
			int index = c[i] - 65;
			ref[index] = 1;
		}
		for (int i = 0; i < ref.length; i++) {
			if (ref[i] == 0) {
				System.out.println("\""+b+"\""+"not a pangram");
				System.exit(0);
			}
		}
		System.out.println("\""+b+"\""+" is Pangram!!");
	}
}
