package kr.co.ezen;

public class MethodTest {
	int a;
	boolean b = true;
	
	public MethodTest() {
		
	}
	
	public void stand() {
		System.out.println("����ȯ ���Ķ�(�Ķ���� = �Ķ�)");
	}
	
	
	public void sleep() {
		System.out.println("public : ���������ڷ� ������Ʈ ��ü���� sleep�޼��尡 ȣ��� �� ������ �ǹ���");		
		System.out.println("void : ��ȯ���̶� �ϰ� �̴� ��ȯ�Ǵ� �������� �ڷ����� �ǹ��Ѵ�. void�� ��ȯ�Ǵ� �����Ͱ� ���ٴ� ���� �ǹ��Ѵ�.");
		System.out.println("sleep : �޼����� �̸��̰� ���߿� �޼��带 ȣ���� �� �� �̸��� ���� �����ν� �޼��� ���� �ȿ� �ִ� �ڵ带 �����ϰ� ��");
		System.out.println("() : �Ķ����, �Ű����� �����ϴ� ������ ��ġ ������ �����ϵ� �ۼ��ϸ� ��. �Ķ���Ͱ� �� �� �̻��� ���� ,�� �����ڷ� �ؼ� ������ ����.");
		System.out.println("{} : �޼����� ����. �޼��� ȣ�� �� �����ϰ� ���� �ڵ带 �ۼ�����.");
		System.out.println("�޼��� ȣ�� : �޼��带 ����ϴ� ���� �ǹ�. ������ �޼������ ���� �Ұ�ȣ�� Ĩ�ϴ�. �׸��� �� �Ұ�ȣ �ȿ� �Ķ������ �ڷ����� �´� ���� �־��ݴϴ�.");
	
	
	}
	
	public void sayHello() {
		System.out.println("Hello~");
		
	}
	
	public void sitDown() {
		System.out.println("�� �ڸ��� ��� ����");
		sayHello();
	}
	
	public void callName(String b) {
		System.out.println("�ȳ��ϼ���,"+b);
	}
	
	public void printDan(int a) {
		System.out.println(a * 1);
		System.out.println(a * 2);
		System.out.println(a * 3);
		System.out.println(a * 4);
		System.out.println(a * 5);
		System.out.println(a * 6);
		System.out.println(a * 7);
		System.out.println(a * 8);
		System.out.println(a * 9);
		
	}
	
	public void printScore(String name , int score) {
		System.out.println(name + " " + score + "��");
	}
	
	
	
	
	
	
	
	
	
	
}
