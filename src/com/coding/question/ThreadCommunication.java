package com.coding.question;

public class ThreadCommunication {
public static void main(String[] args) {
	Q q = new Q();
	Producer1 pr = new Producer1(q, "producer");
	Consumer1 cr = new Consumer1(q, "consumer");

	pr.start();
	cr.start();
}
}

class Q {
	int num;
	boolean isSet;

	public synchronized void getNum(int num, String tName) throws Exception {
		while(!isSet) {
			wait();
		}
		System.out.println( num + ":" + tName);
		isSet=false;
		notify();
	}

	public synchronized void setNum(int num, String tName) throws Exception {
		while(isSet) {
			wait();
		}
		this.num = num;
		System.out.println( this.num + ":" + tName);
		isSet=true;
		notify();
	}

}

class Producer1 extends Thread {
	Q q;
	String name;

	public Producer1(Q q, String name) {
		this.q = q;
		this.name = name;
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			try {
				q.setNum(i,name);
				i=i+2;
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer1 extends Thread {
	Q q;
	String name;

	public Consumer1(Q q, String name) {
		this.q = q;
		this.name = name;
	}

	@Override
	public void run() {
		int i = 1;
		while (true) {
			try {
				q.getNum(i, name);
				i=i+2;
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}