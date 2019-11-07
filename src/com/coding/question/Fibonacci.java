package com.coding.question;

public class Fibonacci {
	public static void main(String[] args) {
//		System.out.println(findNthFib(12));
		System.out.println(fibRecursion(7));
	}

	private static int fibRecursion(int i) {
		
		if (i<=1)
			return i;
		return fibRecursion(i-1)+fibRecursion(i-2);
		
	}

	private static int findNthFib(int n) {
		int first = 0;
		int second = 1;
		int sum = 0;
		for (int i = 2; i < n; ++i) {
			System.out.println(sum);
			sum = first + second;
			first = second;
			second = sum;
		}
		return sum;
	}
}
