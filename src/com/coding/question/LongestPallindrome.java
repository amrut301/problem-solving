package com.coding.question;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class LongestPallindrome {
	public static void main(String[] args) {
		String s = "dskhkjdsglsqhdglkjs";
		int maxCount = 0;
		String longestSub = null;
		isPalindrome(longestSub);

//		for (int i = 0; i < s.length(); ++i) {
//			for (int j = i; j <= s.length(); ++j) {
//				String sub = s.substring(i, j);
//				if (isPalindrome(sub) && sub.length() > maxCount) {
//					maxCount = sub.length();
//					longestSub = sub;
//				}
//			}
		//}
	}

	private static boolean isPalindrome(String sub) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("abc", "");
		map.put("abckjf","");
		map.put("sdfdf", "");
		map.put("abcoiru", "");
		map.put("abclkjflkdsj", "");
		map.entrySet().stream().filter(item->item.getKey().startsWith("abc")).collect(Collectors.toList()).forEach(it->{
			System.out.println(it.getKey());
		});

		return true;
	}
}
