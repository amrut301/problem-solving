package com.coding.question;

import java.util.Arrays;

public class SumOfPair {
	public static void main(String[] args) {
		int[] a = { 1, 4, 6, 3, 8, 5, 2, 7 };
		int sum = 10;
		Arrays.parallelSort(a);
		for(int n :a) {
			System.out.print(n);
		}
		int j = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] + a[j] > sum) {
				j--;
			} else if (a[i] + a[j] < sum) {
				continue;
			}
			if(a[i]+a[j]==sum) {
				System.out.println("\nfound"+i +"  "+ + j+ a[i] + a[j]);
				return;
			}
		}

	}
}
