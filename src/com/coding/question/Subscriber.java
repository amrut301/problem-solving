package com.coding.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Subscriber {
	String name;
	Channel channel;

	public void update() {
		System.out.println("Channel has uploaded the video" + channel.getName());
	}
	
	public void subscribedChannel(Channel ch){
		this.channel=ch;
	}

	public static void main(String[] args) {
		Subscriber sub = new Subscriber();
		Channel cha = new Channel();
		sub.subscribedChannel(cha);
		cha.setName("Amrut");
		cha.register(sub);
		cha.setVideo("mungaru male");
		cha.unregister(sub);
		
		}
}

class Channel {
	String name;
	String video;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subscriber> getSubs() {
		return subs;
	}

	public void setSubs(List<Subscriber> subs) {
		this.subs = subs;
	}
	

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
		notifySubscribers();
	}

	List<Subscriber> subs = new ArrayList<Subscriber>();

	void register(Subscriber sub) {
		subs.add(sub);
	}

	void unregister(Subscriber sub) {
		subs.remove(sub);
		System.out.println("un subscribed");
	}

	private void notifySubscribers() {
		subs.stream().forEach(item -> item.update());
	}
}
