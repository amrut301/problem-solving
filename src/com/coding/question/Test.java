package com.coding.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Integer> sd = Arrays.asList(2, 1, 4, 3, 2, 1, 1, 2, 7, 6, 5, 2);
		sd.stream().collect(Collectors.groupingBy(i -> i, Collectors.toList())).forEach((k, v) -> {
			v.forEach(i -> System.out.print(i));
		});
		PhoneBuilder phone = new PhoneBuilder();
		Phone phon = phone.setBrand("apple").setName("apple 10").setOs("i os").build();
		System.out.println(phon);

	}
}
