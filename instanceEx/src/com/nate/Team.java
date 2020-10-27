package com.nate;

import com.naver.Car;
import com.naver.Person;

import kr.co.ezen.Dog;

public class Team {
	private Person captain;
	private Person member1;
	private Person member2;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	public Team(Person captain, Person member1, Person member2) {
		this.captain = captain;
		this.member1 = member1;
		this.member2 = member2;
	}

	public Person getCaptain() {
		return captain;
	}

	public void setCaptain(Person captain) {
		this.captain = captain;
	}

	public Person getMember1() {
		return member1;
	}

	public void setMember1(Person member1) {
		this.member1 = member1;
	}

	public Person getMember2() {
		return member2;
	}

	public void setMember2(Person member2) {
		this.member2 = member2;
	}
	
	
	
	
	/////////////////////////////////////////////////////////////////////////////
	
	
	public void mem2PrintCarModelName() {
		member2.getK7().getModelName();
		
		
	}
	
	
	
	public void showCaptainCarPrice() {
		Car captainCar = captain.getK7();
		captainCar.showMePrice();
	}
	
	public void mem1Sleep(String where) {
		// String msg = member1.getHappy().sleep("¹æ");
		// sysout(msg);
		System.out.println(member1.getHappy().sleep("¹æ"));
	}
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	
	public char getCaptainCarModelNameFirstChar() {
		Car car = captain.getK7();
		String modelName = car.getModelName();
		return modelName.charAt(0); 
	}
	
	public void changeMem1Dog(Dog dog) {
		member1.setHappy(dog);
		
	}
	
	
	public void changeMem1DogName(String dogName) {
		member1.getHappy().setName(dogName);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	public void fight(Team otherTeam) {
		String aTeamCaptainName = this.captain.getName();
		String bTeamCaptainName = otherTeam.captain.getName();
		System.out.println(aTeamCaptainName + "°ú " + bTeamCaptainName + "ÀÌ ½Î¿ó´Ï´Ù.");
		// System.out.println(this.captain.getName() + "°ú " + otherTeam.captain.getName() + "ÀÌ ½Î¿ó´Ï´Ù.");
	}

	public void fightMem1(Team otherTeamMam) {
		String aTeamMemName = this.member1.getName();
		String bTeamMemName = otherTeamMam.member1.getName();
		System.out.println(aTeamMemName + "°ú " + bTeamMemName + "ÀÌ ½Î¿ó´Ï´Ù.");
		// System.out.println(this.member1.getName() + "°ú " + otherTeamMam.member1.getName());
	}

	public void fightmem2Dog(Team otherTeam) {
		System.out.println(this.member2.getHappy().getName() + "°ú " + otherTeam.member2.getHappy().getName() + "ÀÌ °³½Î¿ó´Ï´Ù.");
	}
	
	public void fightmem2Car(Team otherTeam) {
		System.out.println(this.member2.getK7().getModelName() + "°ú" + otherTeam.member2.getK7().getModelName() + "ÀÌ °æÁÖ¸¦ ÇÕ´Ï´Ù.");		
	}
	
	public void fightcaptain(Team otherTeam) {
		System.out.println(this.captain.getName() + "°ú " + otherTeam.captain.getName() + "ÀÌ ½Î¿ó´Ï´Ù.");
	}
	
	public void showCapDogName(Team otherTeam) {
		System.out.println(otherTeam.captain.getHappy().getName());
	}
	
	
	
}
