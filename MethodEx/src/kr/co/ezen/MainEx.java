package kr.co.ezen;

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
	}
}