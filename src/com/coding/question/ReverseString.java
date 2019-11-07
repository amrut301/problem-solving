package com.coding.question;

import java.util.Arrays;

public class ReverseString {
public static void main(String[] args) {
	String a = "Hello are you doing good?";
	String[] array=a.split("\\s");
	Arrays.stream(array).forEach(item->{
		char[] chararr = item.toCharArray();
		for(int i=0;i<chararr.length/2;i++) {
			char temp=chararr[i];
			chararr[i]=chararr[chararr.length-1-i];
			chararr[chararr.length-1-i]=temp;
		}
		System.out.println(chararr);
	});
}
}
