package com.coding.question;

public class SubString {
public static void main(String[] args) {
	String a = "aaabbabcccce"; //o/p - a3b3c5
	char[] ch = a.toCharArray();
	int count=1;
	int i =0;
	for( i =0;i<ch.length-1;i++) {
		if(ch[i]==ch[i+1]) {
			count++;
		}else {
			System.out.print(ch[i]+""+ count);
			count=1;
		}
	}
	System.out.print(ch[i]+""+ count);
	
	
}
}
