package com.coding.question;

public class ConvertToBinary {
	public static void main(String[] args) {
		int x = 17;
		int bin[] = new int[100];
		int i = 0;
		while (x > 0) {
			bin[i] = x % 2;
			x = x / 2;
			i++;
		}
		for (int j = i-1; j >=0; j--)
			System.out.print(bin[j]);
	}

}
