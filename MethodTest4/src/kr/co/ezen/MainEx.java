package kr.co.ezen;

import com.naver.CarRegistManagementService;
import com.naver.DogRegistManagementService;

public class MainEx {
	
	public static void main(String[] args) {
		
		CarRegistManagementService crms = new CarRegistManagementService();
			
		crms.setCarName("K7");
		
		String carName = crms.getCarName();
		System.out.println(carName);
	
		
		
		
		
		CarRegistManagementService crms2 = new CarRegistManagementService();
		
		long result = crms2.add(2100000000,500000000);
		System.out.println(result);
		
		
		DogRegistManagementService drms = new DogRegistManagementService();
		
		Dog d1 = drms.makeDog("happy", 3);
		System.out.println(d1);
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
	}
}
