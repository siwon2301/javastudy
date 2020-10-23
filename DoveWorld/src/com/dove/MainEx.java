package com.dove;

public class MainEx {
	public static void main(String[] args) {
		
		Person mt1 = new Person();
		
		//디폴트로 불러오기
		mt1.setAddress("seoul");
		mt1.setAge(11);
		mt1.setCat(new Cat());
		mt1.setDog(new Dog());
		mt1.setName("김유신");
		mt1.setSnn("하늘나라");
		
		System.out.println(mt1.getAddress());
		System.out.println(mt1.getAge());
		System.out.println(mt1.getCat());
		System.out.println(mt1.getDog());
		System.out.println(mt1.getName());
		System.out.println(mt1.getSnn());
		
		System.out.println(":::::::::::::::::::::::::::::::::::");
		
		//생성자로 불러오기
		
		Person mt2 = new Person("이순신",20,"하늘나라2","seoul",new Dog("짭지","seoul",1,010),new Cat());
		
		Dog d1 = mt2.getDog();
		System.out.println(d1.getAge());
		
		System.out.println(mt2.getDog().getAge());
		
		
		
		System.out.println(":::::::::::::::");
		System.out.println(mt2.getAddress());
		System.out.println(mt2.getAge());
		System.out.println(mt2.getName());
		System.out.println(mt2.getSnn());
		System.out.println(mt2.getCat());
		System.out.println(mt2.getDog());
		
		
		
	}
}
