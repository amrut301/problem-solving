package com.coding.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class FindLengthOfWords {
public static void main(String[] args) {
	String a = "Find the minimum and maximum length of the word in this string";
	Comparator<Integer> comparator = (x,b)->{
		return x>b?1:x<b?-1:0;
	};
	Optional<Integer> sds = Arrays.stream(a.split("\\s")).map(item->item.length()).max(comparator);
	
	System.out.println(sds.get());
}
}

