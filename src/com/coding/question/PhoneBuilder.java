package com.coding.question;

public class PhoneBuilder {
	private String name;
	private String os;
	private String brand;

	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	Phone build() {
		return new Phone(name,os,brand);
	}
	

}
