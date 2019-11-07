package com.coding.question;

public class Queue {
	int size;
	int front;
	int rear;
	int[] queue;

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public Queue(int size) {
		queue = new int[size];
		front = -1;
		rear = -1;
	}

	public void enque(int data) {
		if (front ==-1 && rear ==-1) {
			front++;
			queue[front] = data;
			rear++;
		} else {
			rear++;
			queue[rear] = data;
		}
	}
	public void print() {
		for (int i = front; i <=rear; i++) {
			System.out.println(queue[i]);
		}
	}
	public int dequeue(){
		return queue[front++];
	}

	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enque(2);
		q.enque(5);
		q.enque(1);
		q.enque(4);
		q.print();
		System.out.println("front :" +q.getFront());
		System.out.println("rear :" +q.getRear());
		System.out.println("dequeud: "+q.dequeue());
		q.print();
	}
}
