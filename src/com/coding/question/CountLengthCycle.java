package com.coding.question;

public class CountLengthCycle {
public static void main(String[] args) {
	int a[] = {1,2,3,4,6,5,0};
	int startindex=0;
	int jumpIndex = startindex;	
	int count=0;
	int found=0;
	while(true) {
		int num = a[jumpIndex];
		jumpIndex=num;
		count++;
		if(jumpIndex==startindex) {
			found=count;
			break;
		}
		}
	System.out.println(found);
	}
}
