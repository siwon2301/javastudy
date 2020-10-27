package com.naver;

public class Hero {
	private Bow bow;
	private Sword sword;
	private Spear spear;

	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(Bow bow, Sword sword, Spear spear) {
		super();
		this.bow = bow;
		this.sword = sword;
		this.spear = spear;
	}

	public Bow getBow() {
		return bow;
	}

	public void setBow(Bow bow) {
		this.bow = bow;
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public Spear getSpear() {
		return spear;
	}

	public void setSpear(Spear spear) {
		this.spear = spear;
	}
	
	public void attackbyspear(Monster mon) {
		spear.attack(mon);
		
	}
	
	public void attackbybow(Monster mon) {
		bow.attack(mon);
	}

}
