package com.coding.question;

public class LongestUniform {
	public static void main(String[] args) {
		String a = "xxxx";
		char maxchar = 0;
		int maxIndex=0;
		char[] chars = a.toCharArray();
		int max = 0, temp = 1;
		for (int i = 0; i < chars.length-1; i++) {
			if (chars[i] != chars[i + 1]) {
				temp = 1;
			} else {
				if(temp>max) {
					max=temp;
					maxchar=chars[i];
					maxIndex=i;
				}
				temp++;
			}
			max = Math.max(temp, max);
		}
		System.out.println(max);
		System.out.println(maxchar);
		System.out.println(maxIndex);
		
	}
}
