package com.coding.question;

import java.util.HashSet;
import java.util.Set;

class MyClass {
	public static Integer CONSTANT = 0;

	private void modifyStaticVar(int incrementBy) {
		CONSTANT += incrementBy;
		System.out.println("CONSTANT : " + CONSTANT);
	}

	public static void main(String[] args) {
		MyClass a = new MyClass();
		MyClass b = new MyClass();

		String str = "geekforseek";
		char[] ch = str.toCharArray();
		int maxCount = 0;
		Set<Character> set = new HashSet<Character>();
		int j = 0;
		int i = 0;
		while (i < ch.length && j < ch.length) {
			if (!set.contains(ch[j])) {
				set.add(ch[j]);
				j++;
				maxCount = Math.max(maxCount, j - i);
			} else {
				set.remove(ch[i]);
				i++;
			}
		}
		System.out.println(maxCount);
	}
}
