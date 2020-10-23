package kr.co.ezen;

public class MainEx {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		Test1 t2 = new Test1();
		
		t1 = new Test1();
		
		
		Test1 t3 = new Test1(34L);
		
		Test1 t4 = new Test1(33, 35);
		
		
		System.out.println("///////////////////////////////////////////////");
		
		// 셋을 입력하지 않고 먼저 겟을 했을 때. 디폴트 생성자로 만든 객체
		Person kim0 = new Person();
		System.out.println(kim0.getSsn());
		System.out.println(kim0.getName());
		System.out.println(kim0.getAge());
		System.out.println(kim0.getAddress());
		System.out.println(kim0.getJob());
		System.out.println(kim0.getDog());
		System.out.println(kim0.getCar());
		
		// 디폴트 생성자로 만든 객체
		kim0.setSsn("s01");
		kim0.setName("kim");
		kim0.setAge(44);
		kim0.setAddress("seoul");
		kim0.setJob("lec");
		kim0.setDog(null);
		kim0.setCar(null);
		

		System.out.println(kim0.getSsn());
		System.out.println(kim0.getName());
		System.out.println(kim0.getAge());
		System.out.println(kim0.getAddress());
		System.out.println(kim0.getJob());
		System.out.println(kim0.getDog());
		System.out.println(kim0.getCar());
		
		
		//생성자로 만든 객체
		
		Person kim1 = new Person("s01","lee",44,"seoul", "lec",new Dog(), null);
		
		System.out.println(kim1.getSsn());
		System.out.println(kim1.getName());
		System.out.println(kim1.getAge());
		System.out.println(kim1.getAddress());
		System.out.println(kim1.getJob());
		System.out.println(kim1.getDog());
		System.out.println(kim1.getCar());
		
		
		
		
		
		
	}
}
