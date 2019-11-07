package com.coding.question;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchT {
public static void main(String[] args) {
	CountDownLatch count = new CountDownLatch(4);
	TeamMember1 member1 = new TeamMember1(2000,"sir",count);
	TeamMember1 member2 = new TeamMember1(3000,"Josh",count);
	TeamMember1 member3 = new TeamMember1(4000,"high",count);
	TeamMember1 member4 = new TeamMember1(5000,"how",count);
	member1.start();
	member2.start();
	member3.start();
	member4.start();
	
	System.out.println("--------------DONE---------");
	System.out.println("statte : "+member1.getState());
	System.out.println("statte : "+member2.getState());
	System.out.println("statte : "+member3.getState());
	System.out.println("statte : "+member4.getState());
;}
}

class TeamMember1 extends Thread {
	int duration;
	String name;
	CountDownLatch count;

	public TeamMember1(int duration, String name,CountDownLatch count) {
		this.duration = duration;
		this.name = name;
		this.count=count;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(duration);
			System.out.println("Team member: "+name +" finiched the task");
			count.await();
			System.out.println("what?");
		} catch (InterruptedException  e) {
		}
	}
}
