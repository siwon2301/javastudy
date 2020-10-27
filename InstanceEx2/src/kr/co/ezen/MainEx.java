package kr.co.ezen;

import com.naver.Bow;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Spear;
import com.naver.Sword;

public class MainEx {
	public static void main(String[] args) {
		
		Monster mon = new Monster();
		Bow bow = new Bow();
		Spear spear = new Spear();
		Sword sword = new Sword();
		Hero hero = new Hero();
		hero.setBow(bow);
		hero.setSpear(spear);
		hero.setSword(sword);
		hero.attackbyspear(mon);
		hero.attackbybow(mon);
		
	}
}
