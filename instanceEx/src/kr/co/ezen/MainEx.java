package kr.co.ezen;

import java.util.Calendar;
import java.util.Date;

import com.nate.Team;
import com.naver.Car;
import com.naver.Person;

public class MainEx {
	public static void main(String[] args) {		
		Car car1 = new Car("K7","1",4000);
		// car1.showMePrice();
		Car car2 = new Car("bmw","2",5000);
		Car car3 = new Car("sm5","3",4000);
		
		Dog dog1 = new Dog(1,"happy",new Date(11));
		Dog dog2 = new Dog(2, "merry", new Date());
		Dog dog3 = new Dog(3,"¹é±¸",new Date(Calendar.getInstance().getTimeInMillis()));
		
		Person captain = new Person("p1","aÆÀÁÖÀå",dog1,car1);
		Person member1 = new Person("p2","±èÀ¯½Å",dog2,car2);
		Person member2 = new Person("p3","ÀÌ¼ø½Å",dog3,car3);
		
		Team aTeam = new Team(captain, member1, member2);
		
		Car car4 = new Car("¾Å¾ÅÄ«", "4", 900);
		Car car5 = new Car("ºØºØÄ«", "5", 990);
		Car car6 = new Car("¾Å½ßÄ«", "6",890);
		
		Dog dog4 = new Dog(4, "¶¯±¸", new Date());
		Dog dog5 = new Dog(5, "ºý±¸", new Date());
		Dog dog6 = new Dog(6, "Â¯±¸", new Date());
		
		
		Person bcaptain = new Person("p4", "bÆÀÁÖÀå", dog4, car4);
		Person member3 = new Person("p5", "±è¹Î¼ö", dog5, car5);
		Person member4 = new Person("p6","±èÃ¶¼ö",dog6,car6);
		
		
		Team bTeam = new Team(bcaptain, member3, member4);
		
		
		
		
		
		aTeam.fight(bTeam);
		bTeam.fight(aTeam);
		
		aTeam.fightMem1(bTeam);
		bTeam.fightMem1(aTeam);
		
		aTeam.fightmem2Dog(bTeam);
		
		aTeam.fightmem2Car(bTeam);
		
		aTeam.fightcaptain(bTeam);
		bTeam.fightcaptain(aTeam);
		aTeam.getCaptain().getK7().showMePrice();
		
		
		
		
		
	}
}
