package kr.co.ezen;

import com.naver.MethodTest2;
import com.naver.MethodTest3;

public class MainEx {
	public static void main(String[] args) {
		MethodTest mt1 = new MethodTest(); //객체 선언
		MethodTest mt2 = new MethodTest(); //객체 선언
		
		
		mt1.stand(); //mt1에서 stand();를 호출
		mt1.sleep();
		
		mt1.sayHello();
		mt2.sitDown();
		mt1.callName("피라미터는 이름을 넘겨줍니다.");
		mt1.printDan(3);
		mt2.printScore(new String("홍길동"), 55 );
		mt2.printScore("김유신", 58);
		
		Test12 mt4 = new Test12();
		
		mt4.hello();
		mt4.printScore("이순신", 55);
		

		MethodTest2 mt5 = new MethodTest2();
		int re1 = mt5.giveMeTheMoney();
		
		MethodTest2 mt6 = new MethodTest2();
		int re2 = mt6.giveMeTheMoney();
		
		int re3 = mt5.giveMeTheMoney();
		
		re2 = mt6.giveMeTheMoney();
		
		System.out.println(mt5.giveMeTheMoney());
		System.out.println();
		
		MethodTest3 mt10 = new MethodTest3();
		String i = mt10.getTest12();
		System.out.println(i);
		
		
		MethodTest3 mt20 = new MethodTest3();
		String c = mt20.getTest20("이순신", 55);
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
	}
}