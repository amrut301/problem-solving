package com.coding.question;

public class MergeSortedArray {
public static void main(String[] args) {
	int [] arr1= {2,4,6,8,9};
	int [] arr2 = {3,5,6,10};
	int len1= arr1.length;
	int len2= arr2.length;
	int [] merge = new int[len1+len2];
	int i=0,j=0,k=0;
	while(i<len1&&j<len2){
		if(arr1[i]<arr2[j]) {
			merge[k++]=arr1[i++];
		}else {
			merge[k++]=arr2[j++];
		}
	}
	while(i<len1) {
		merge[k++]=arr1[i++];
	}
	while(j<len2) {
		merge[k++]=arr2[j++];
	}
	for(int m : merge) {
		System.out.print(m);
	}
}
}
