package com.coding.question;

public class Stack {
	int arr[];
	int top;
	int capacity;

	public Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int number) {
		
		arr[++top]=number;
	}

	int pop() {
		arr[top]=0;
		return arr[--top];
		
	}
	void print (){
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Stack stack = new Stack(6);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.print();
		stack.pop();
		System.out.println("----------");
		stack.print();
	}
}
