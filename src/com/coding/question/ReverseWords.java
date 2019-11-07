package com.coding.question;

public class ReverseWords {
public void main () {
String a ="Dog is Barking";
		String[] tempWord = a.split("\\s");
		
		for(int i=0;i<tempWord.length;i++) {
			char [] wordCharArray = tempWord[i].toCharArray();
			for(int j=0;j<wordCharArray.length;j++) {
				char temp=wordCharArray[i];
				wordCharArray[i]=wordCharArray[wordCharArray.length-1];
				wordCharArray[wordCharArray.length-1]=temp;
			}
			
		}
	
}
}
