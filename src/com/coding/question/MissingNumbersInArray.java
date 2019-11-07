package com.coding.question;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MissingNumbersInArray {
	public static void main(String args[]) throws Exception {
		int x=2;
		System.out.println(x>>5);
		System.out.println(x<<10);
		System.out.println(x<<1);
		System.out.println(x<<1);
		List<List<Integer>> list =new ArrayList<List<Integer>>();
		List<Integer>l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		l1.add(2);
		l1.add(9);
		l1.add(2);
		l1.add(3);
		l2.add(4);
		l2.add(7);
		l2.add(8);
		list.add(l1);
		list.add(l2);
		Map<Object, Long> sdksjlkf = list.stream().flatMap(l->l.stream()).collect(Collectors.groupingBy(e->e,Collectors.counting()));
		sdksjlkf.forEach((k,v)->{
			System.out.print(k +""+ v);
		});
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		int[] input = new int[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			input[i] = sc.nextInt();
		}

		int[] register = new int[input.length+1];
		for (int i : input) {
			register[i] = 1;
		}

		// now, let's print all the absentees
		System.out.println("missing numbers in given array");
		for (int i = 1; i < register.length; i++) {
			if (register[i] == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
