package com.coding.question;

public class MinimumSecond {
public static void main(String[] args) {
	int a[]= {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,6,7,8};
	int first =Integer.MAX_VALUE;
	int second=Integer.MAX_VALUE;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]<first) {
			first=a[i];
		}else if (a[i]!=first && a[i]<second) {
			second=a[i];
		}
	}
	System.out.println(second);
	System.out.println(first);
}
}
