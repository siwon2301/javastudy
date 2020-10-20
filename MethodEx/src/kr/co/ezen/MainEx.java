package kr.co.ezen;

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
	}
}