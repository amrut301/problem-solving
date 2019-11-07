package com.coding.question;

public class DistanceWord {
	public static void main(String[] args) {
		String a = "a man is walking and another man man is watching him";
		String[] arr = a.split("\\s");
		char[] ch = a.toCharArray();
		int charCount = 0;
		int start = 0;
		int end = 0;
		int freq = 0;
		for (int i = 0; i < arr.length; i++) {
			charCount += arr[i].length() + 1;
			if (arr[i].equals("man")) {
				if (freq == 0) {
					freq++;
					start = charCount;
				} else {
					freq++;
					end=charCount;
				}
//				i = i + "man".length();
				System.out.println("oh");
			}
		}
		System.out.println(freq);
		System.out.println(end-start);
	}
}
