package com.coding.question;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SharedObject {
	int numbers;
	boolean isDone;

	public static void main(String[] args) {

		List<List<String>> lsitOfList = new ArrayList<List<String>>();
		List<String> l1 = new ArrayList<String>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");

		List<String> l2 = new ArrayList<String>();
		l2.add("E");
		l2.add("F");
		l2.add("G");
		l2.add("H");
		lsitOfList.add(l1);
		lsitOfList.add(l2);
		List<String> list = lsitOfList.stream().flatMap(List::stream).collect(Collectors.toList());
		list.stream().forEach(System.out::print);
		List<String> list222 = lsitOfList.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
		System.out.println("\n--------");
		list222.forEach(System.out::print);
		SharedObject shared = new SharedObject();
		shared.numbers = 10;
		Thread producer = new Producer(shared);
		Thread consumer = new Consumer(shared);
//		producer.start();
//		consumer.start();
	}

	synchronized void produce(int n) throws InterruptedException {
		while (true) {
			if (isDone) {
				System.out.println("A : " + n);
				isDone = false;
				notify();
			} else {
				wait();
			}

		}

	}

	synchronized void consume(int n) throws InterruptedException {
		while (true) {
			if (isDone) {
				System.out.println("consume : " + n);
				isDone = false;
				notify();

			} else {
				wait();
			}

		}

	}

}

class Producer extends Thread {
	SharedObject shared;
	boolean isDone;

	public Producer(SharedObject shared) {
		this.shared = shared;
	}

	@Override
	public void run() {
		try {
			shared.produce(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		i = i + 2;

	}

}

class Consumer extends Thread {
	SharedObject shared;

	public Consumer(SharedObject shared) {
		this.shared = shared;
	}

	@Override
	public void run() {

		try {
			shared.consume(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		i = i + 2;

	}

}
