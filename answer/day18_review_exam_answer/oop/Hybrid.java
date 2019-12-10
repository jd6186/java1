package com.lec.java.review_oop;

public class Hybrid extends Car{
	int electric;

	public int getElectric() {
		return electric;
	}

	public void setElectric(int electric) {
		this.electric = electric;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("-----------Hybrid 상태입니다.-----------");
		System.out.println("speed : " + getSpeed());
		System.out.println("oil : " + getOil());
		System.out.println("electric : " + this.electric);
		
	}
	
	
}
