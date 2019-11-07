package com.coding.question;

public class Spiral {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4, 5 },
						{ 6, 7, 8, 9, 10 },
						{ 11, 12, 13, 14, 15 },
						{ 16, 17, 18, 19, 20 },
						{ 21, 22, 23, 24, 25 } };
		int top = 0;
		int left = 0;
		int bottom = 4;
		int right = 4;
		while (top <= bottom && left <= right) {

			for (int i = left; i < right; i++) {
				System.out.print(" " + arr[top][i]);
			}
			top++;
			for (int i = right; i < bottom; i++) {
				System.out.print(" " + arr[bottom][i]);
			}
			right--;
			for (int i = bottom; i > left; i--) {
				System.out.print(" " + arr[left][i]);
			}
			bottom--;
			for (int i = right; i > top; i--) {
				System.out.print(" " + arr[i][bottom]);
			}
			left++;
		}

	}
}
