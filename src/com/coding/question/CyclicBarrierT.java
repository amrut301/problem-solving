package com.coding.question;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierT {
	public static void main(String[] args) {
		CyclicBarrier cyclic = new CyclicBarrier(4);
		TeamMember member1= new TeamMember(5000, "Amrut", cyclic);
		TeamMember member2= new TeamMember(5000, "lata", cyclic);
		TeamMember member3= new TeamMember(5000, "tejaswini", cyclic);
		TeamMember member4= new TeamMember(5000, "ashiwni", cyclic);
		member1.start();
		member2.start();
		member3.start();
		member4.start();
		

	}
}

class TeamMember extends Thread {
	int duration;
	String name;
	CyclicBarrier cyclic;

	public TeamMember(int duration, String name,CyclicBarrier cyclic) {
		this.duration = duration;
		this.name = name;
		this.cyclic=cyclic;
	}
	@Override
	public void run() {
		try {
			System.out.println("Team member: "+name +"  has come to the meeting");
			Thread.sleep(duration);
			int await = cyclic.await();
			if(await==3) {
				System.out.println("\n\n Meeting Started....!");
			}
		} catch (InterruptedException | BrokenBarrierException e) {
		}
	}
}
