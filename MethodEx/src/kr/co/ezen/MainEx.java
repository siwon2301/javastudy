package kr.co.ezen;

import com.naver.MethodTest2;
import com.naver.MethodTest3;

public class MainEx {
	public static void main(String[] args) {
		MethodTest mt1 = new MethodTest(); //��ü ����
		MethodTest mt2 = new MethodTest(); //��ü ����
		
		
		mt1.stand(); //mt1���� stand();�� ȣ��
		mt1.sleep();
		
		mt1.sayHello();
		mt2.sitDown();
		mt1.callName("�Ƕ���ʹ� �̸��� �Ѱ��ݴϴ�.");
		mt1.printDan(3);
		mt2.printScore(new String("ȫ�浿"), 55 );
		mt2.printScore("������", 58);
		
		Test12 mt4 = new Test12();
		
		mt4.hello();
		mt4.printScore("�̼���", 55);
		

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
		String c = mt20.getTest20("�̼���", 55);
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
	}
}