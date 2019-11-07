package com.coding.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LargetNonRepeatingInSeqSubstring {
public static void main(String[] args) {
	String a = "AxyxzxamrutxZ";
	List<String> list = new ArrayList<String>();
	list.add("abc");
	list.add("abc");
	list.add("fsda");
	list.add("jhg");
	list.add("abc");
	list.add("erwreoies");
	Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(map);
	StringBuilder subString = new StringBuilder();
	char[] chars = a.toCharArray();
	for(int i= 0;i<chars.length-1;i++) {
		if(chars[i]==chars[i+1]) continue;
		else {
			subString.append(chars[i+1]);
		}
	}
	System.out.println(subString);
}
}
