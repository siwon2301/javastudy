package com.dove;

public class Dog {
	private String name;
	private String address;
	private int age;
	private int tel;
	
	public Dog() {
	
	}

	public Dog(String name, String address, int age, int tel) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
	
	
	
	
	
	
	
}
