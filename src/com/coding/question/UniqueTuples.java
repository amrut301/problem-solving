package com.coding.question;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueTuples {
public static void main(String[] args) {
	String a="abbccde";;
	int len=2;
	Set<String> set  = new LinkedHashSet<String>();
	for(int i=0;i<=a.length()-len;i++) {
		set.add(a.substring(i,i+len));
	}
	System.out.println(set);
}
}
