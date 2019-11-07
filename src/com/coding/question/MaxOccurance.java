package com.coding.question;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccurance {
	public static void main(String[] args) {
		Integer[] arrayP = { 2, 1, 4, 3, 2, 1, 1, 2, 7, 6, 5, 2 };
		Map<Integer, Long> dffd = Arrays.stream(arrayP)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		
		System.out.println(dffd);
	}

}
