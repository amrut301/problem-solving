package com.coding.question;

public class PrimeFactor implements Cloneable {
	public static void main(String[] args) {
		int num = 1024;
		for (int i = 2; i <= num; i++) {
			int count = 0;
			while (num % i == 0) {
//				if (num % i == 0) {
					num = num / i;
					count++;
//				}
			}
			if (count != 0)
				System.out.println(i + "^" + count);
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();

	}
}
