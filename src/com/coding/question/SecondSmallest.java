package com.coding.question;

public class SecondSmallest {
	/**
	 * int secondSmallest(int[] x)
	 */
	public static int secondSmallest(int[] x) {

		if (x.length < 2)
			return x[0];
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < x.length; i++) {
			if (x[i] < smallest) {
				secondSmallest = smallest;
				smallest = x[i];
			} else if (x[i] != smallest && x[i] < secondSmallest) {
				secondSmallest = x[i];
			}
		}
		return secondSmallest;

	}

	public static void main(String args[]) {

		int[] a = {12, 3, 4, 6, 1223, 23, -234, -33,-12 };

		System.out.println(secondSmallest(a));
	}
}