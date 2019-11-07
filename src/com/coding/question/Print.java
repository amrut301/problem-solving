package com.coding.question;

public class Print {

	boolean flag = false;

	public synchronized void print(int n) {
		System.out.println(n);
	}

	public static void main(String[] args) {
		Print p = new Print();
		Thread t1 = new Thread1(p);
		Thread t2 = new Thread2(p);
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread {
	Print p;

	public Thread1(Print p) {
		this.p = p;
	}

	@Override
	public void run() {
		for(int i =1;i<10;i++) {
			p.print(i++);
		}
	}
}

class Thread2 extends Thread {
	Print p;

	public Thread2(Print p) {
		this.p = p;
	}

	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			p.print(i++);
		}
	}
}