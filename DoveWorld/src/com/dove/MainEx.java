package com.dove;

public class MainEx {
	public static void main(String[] args) {
		
		Person mt1 = new Person();
		
		//����Ʈ�� �ҷ�����
		mt1.setAddress("seoul");
		mt1.setAge(11);
		mt1.setCat(new Cat());
		mt1.setDog(new Dog());
		mt1.setName("������");
		mt1.setSnn("�ϴó���");
		
		System.out.println(mt1.getAddress());
		System.out.println(mt1.getAge());
		System.out.println(mt1.getCat());
		System.out.println(mt1.getDog());
		System.out.println(mt1.getName());
		System.out.println(mt1.getSnn());
		
		System.out.println(":::::::::::::::::::::::::::::::::::");
		
		//�����ڷ� �ҷ�����
		
		Person mt2 = new Person("�̼���",20,"�ϴó���2","seoul",new Dog("¬��","seoul",1,010),new Cat());
		
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
