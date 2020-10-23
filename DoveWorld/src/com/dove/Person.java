package com.dove;

public class Person {
	private String name;
	private int age;
	private String snn;
	private String address;
	private Dog dog;
	private Cat cat;
	
	public Person() {
		
	}

	public Person(String name, int age, String snn, String address, Dog dog, Cat cat) {
		this.name = name;
		this.age = age;
		this.snn = snn;
		this.address = address;
		this.dog = dog;
		this.cat = cat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSnn() {
		return snn;
	}

	public void setSnn(String snn) {
		this.snn = snn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	
	
	
}
