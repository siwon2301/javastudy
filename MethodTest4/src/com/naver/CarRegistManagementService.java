package com.naver;

public class CarRegistManagementService {
	
	private String carName;
	
	public CarRegistManagementService() {
		carName = "�ҳ�Ÿ";
	}
	
	public void setCarName(String carName) {
		this.carName = carName;		
	}
	
	public String getCarName() {
		return carName;
		
	}
	
	
	public int getCountCarName(String carName) {
		
		int size = carName.length();
		
		return size;	
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public long add(int a, int b) {
		return (long)a + b;
		
	}
	////////////////////////////////////////////////
	
	
	
	
	
	
	
	
}
