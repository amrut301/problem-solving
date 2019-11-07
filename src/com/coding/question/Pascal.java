package com.coding.question;
/*
**  Below formation is called Pascals Triangle.
**
**  Example:
**        1
**        1 1
**        1 2 1
**        1 3 3 1
		  1 4 6 4 1
**        1 5 10 10 5 1
**        1 6 15 20 15 6 1
**
**  Complete the 'pascal' function below so that given a
**  col and a row it will return the value in that positon.
**
**  Example, pascal(1,2) should return 2
**
*/

public class Pascal {

	public static int pascal(int col, int row) {

		int[][] pascalArray = new int[row + 1][row + 1];

		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					pascalArray[i][j] = 1;
				} else {
					pascalArray[i][j] = 
							pascalArray[i - 1][j - 1] + pascalArray[i - 1][j];
				}
			}
		}
		return pascalArray[row][col];
	}

	public static void main(String[] args) {
		if (Pascal.pascal(0, 0) == 1 && Pascal.pascal(1, 2) == 2
				&& Pascal.pascal(5, 6) == 6 && Pascal.pascal(4, 8) == 70
				&& Pascal.pascal(6, 6) == 1) {
			System.out.println("Pass");
		} else {
			System.out.println("Failed");
		}
	}
}
