package com.coding.question;

import java.util.ArrayList;
import java.util.List;

public class SubarraySubstring {
	public static void main(String[] args) {
		int arr[] = { 1, 9, 10, 1, 0, 200, 3, 2, 1, 250 };
		int sum = 11;
		int minLen = arr.length;
		int[] subarr = new int[arr.length];
		System.out.println(find(arr, sum, minLen, subarr));

	}

	private static int find(int[] arr, int sum, int minLen, int[] subarr) {
		for (int i = 0; i < arr.length; i++) {
			int curSum = arr[i];
			if (curSum > sum) {
				return 1;
			}
			for (int j = i + 1; j < arr.length; j++) {
				curSum = curSum + arr[j];
				if (curSum > sum) {
					minLen = Math.min(minLen, (j - i) + 1);
				}
			}
		}
		return minLen;
	}
}
