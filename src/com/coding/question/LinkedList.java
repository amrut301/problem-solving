package com.coding.question;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.w3c.dom.stylesheets.LinkStyle;

public class LinkedList {
	Node head;

	class Node {
		public Node(int data) {
			this.data = data;
		}

		int data;
		Node next;
	}

	void push(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node temp = head;
		Node prev = null;
		while (temp != null) {
			prev = temp;
			temp = temp.next;

		}
		temp = new Node(data);
		prev.next = temp;

	}

	public void reverse() {
		Node cur = head;
		Node prev = null;
		Node next = null;
		while (cur != null) {
			next = cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		head=prev;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	List getUnion(Node head1, Node head2) {

		// iterate over first list
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		Node temp1 = head1;
		Node temp2 = head2;
		while (temp1.next != null) {
			if (map.containsKey(temp1.data)) {
				map.put(temp1.data, map.get(temp1.data) + 1);
			} else {
				map.put(temp1.data, 1);
			}
			temp1 = temp1.next;
		}
		while (temp2.next != null) {
			if (map.containsKey(temp1.data)) {
				map.put(temp1.data, map.get(temp1.data) + 1);
			} else {
				map.put(temp1.data, 1);
			}
			temp2 = temp2.next;
		}

		return null;

	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.push(1);
		linkedList.push(5);
		linkedList.push(4);
		linkedList.push(14);
		linkedList.push(534);
		linkedList.push(421);
		linkedList.push(1324);
		linkedList.push(53);
		linkedList.push(4234);

		linkedList.print();
		System.out.println("------");
		linkedList.reverse();;
		linkedList.print();
	}
}
