package com.coding.question;

public class Phone {
	private String name;
	private String os;
	private String brand;

	public Phone(String name, String os, String brand) {

		this.name = name;
		this.os = os;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", os=" + os + ", brand=" + brand + "]";
	}

}
